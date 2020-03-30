package kapitel_20;

import java.sql.*;

public class VisTransaktionsisolering {
	public static void main(String[] arg) throws Exception {
		new Thread(() -> læsning()).start();
		Thread.sleep(1500);
		new Thread(() -> skriv()).start();
	}

	private static int transaktionsisolering = 0; //Connection.TRANSACTION_SERIALIZABLE;

	private static void læsning() {
		try {
			Connection forb = DriverManager.getConnection("jdbc:mysql:///test?useSSL=false");
			if (transaktionsisolering > 0) forb.setTransactionIsolation(transaktionsisolering);
			if (transaktionsisolering > 0) forb.setAutoCommit(false);

			Statement stmt = forb.createStatement();

			for (int i = 0; i < 8; i++) {

				ResultSet rs = stmt.executeQuery("select NAVN, KREDIT from KUNDER");
				String res = "";
				while (rs.next()) {
					String navn = rs.getString("NAVN");
					double kredit = rs.getDouble("KREDIT");
					res += navn + " " + kredit + "; ";
				}
				System.out.println("Læsning: " + res);

				Thread.sleep(1000);
			}

			if (transaktionsisolering > 0) forb.commit();
			System.out.println("Læsning afslutter");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static void skriv() {
		try {
			String tråd = Thread.currentThread().getName() + "                                      ";
			Connection forb = DriverManager.getConnection("jdbc:mysql:///test?useSSL=false");
			if (transaktionsisolering > 0) forb.setTransactionIsolation(transaktionsisolering);
			if (transaktionsisolering > 0) forb.setAutoCommit(false);

			Statement stmt = forb.createStatement();

			stmt.executeUpdate("delete from KUNDER"); // slet alle rækker fra tabellen
			System.out.println(tråd + " slettet alle rækker. Tabellen er nu tom.");
			Thread.sleep(1000);

			stmt.executeUpdate("insert into KUNDER values('Jacob', 20)");
			stmt.executeUpdate("insert into KUNDER values('Robert', 20)");
			System.out.println(tråd + " indsat Jacob og Robert med 20 kr");
			Thread.sleep(1000);

			int robertKredit = 100 + (int) (Math.random() * 100);
			stmt.executeUpdate("update KUNDER set KREDIT=" + robertKredit + " WHERE navn='Robert'");
			System.out.println(tråd + " Robert har nu " + robertKredit + " kr");
			Thread.sleep(1000);

			if (transaktionsisolering > 0) forb.commit();
			System.out.println(tråd + " afslutter");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}