package kapitel_20;

import java.sql.*;

public class VisTransaktionsisolering {
	public static void main(String[] arg) throws Exception {
		kørLæsningOgSkrivning(0);
		kørLæsningOgSkrivning(Connection.TRANSACTION_READ_UNCOMMITTED);
		kørLæsningOgSkrivning(Connection.TRANSACTION_READ_COMMITTED);
		kørLæsningOgSkrivning(Connection.TRANSACTION_REPEATABLE_READ);
		kørLæsningOgSkrivning(Connection.TRANSACTION_SERIALIZABLE);
	}

	private static void kørLæsningOgSkrivning(int transaktionsisolering) throws Exception {
		System.out.println(" ********* transaktionsisolering = " + transaktionsisolering + " ****************");
		Thread læsTråd = new Thread(() -> læsning(transaktionsisolering));
		Thread skrivTråd = new Thread(() -> skriv(transaktionsisolering));
		læsTråd.start();
		Thread.sleep(1500);
		skrivTråd.start();
		læsTråd.join();
		skrivTråd.join();
		System.out.println("----- alle tråde er nu afsluttet -----\n");
	}


	private static void læsning(int transaktionsisolering) {
		try {
			Connection forb = DriverManager.getConnection("jdbc:mysql:///test?useSSL=false");
			if (transaktionsisolering > 0) forb.setTransactionIsolation(transaktionsisolering);
			if (transaktionsisolering > 0) forb.setAutoCommit(false);

			Statement stmt = forb.createStatement();

			for (int i = 0; i < 8; i++) {

				if (i == 4) {
					//stmt.executeUpdate("update KUNDER set KREDIT=55555 WHERE navn='Robert'");
				}
				String res = læsIndhold(stmt);
				System.out.println("Læsning fik: " + res);

				Thread.sleep(1000);
			}

			if (transaktionsisolering > 0) forb.commit();
			System.out.println("Læsning afslutter");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String læsIndhold(Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery("select NAVN, KREDIT from KUNDER");
		String res = "'";
		while (rs.next()) {
			String navn = rs.getString("NAVN");
			double kredit = rs.getDouble("KREDIT");
			res += navn + " " + kredit + "; ";
		}
		return res + "'";
	}


	private static void skriv(int transaktionsisolering) {
		try {
			String tråd = "                                           " + Thread.currentThread().getName();
			Connection forb = DriverManager.getConnection("jdbc:mysql:///test?useSSL=false");
			if (transaktionsisolering > 0) forb.setTransactionIsolation(transaktionsisolering);
			if (transaktionsisolering > 0) forb.setAutoCommit(false);

			Statement stmt = forb.createStatement();

			stmt.executeUpdate("delete from KUNDER"); // slet alle rækker fra tabellen
			System.out.println(tråd + " slettet alle rækker, tabel er tom: " + læsIndhold(stmt));
			Thread.sleep(1000);

			stmt.executeUpdate("insert into KUNDER values('Jacob', 20)");
			stmt.executeUpdate("insert into KUNDER values('Robert', 20)");
			System.out.println(tråd + " indsat Jacob og Robert med 20 kr:  " + læsIndhold(stmt));
			Thread.sleep(1000);

			int robertKredit = 100 + transaktionsisolering; // 100, 101, 102, 104 eller 108
			stmt.executeUpdate("update KUNDER set KREDIT=" + robertKredit + " WHERE navn='Robert'");
			System.out.println(tråd + " sat Roberts kredit til " + robertKredit + " kr:     " + læsIndhold(stmt));
			Thread.sleep(1000);

			if (transaktionsisolering > 0) forb.commit();
			System.out.println(tråd + " afslutter                          " + læsIndhold(stmt));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}