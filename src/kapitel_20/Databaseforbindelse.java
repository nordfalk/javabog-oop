package kapitel_20;
import java.sql.*;
import java.util.*;

public class Databaseforbindelse
{
	private Statement stmt;

	public Databaseforbindelse() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection forb = DriverManager.getConnection("jdbc:mysql:///test");
		stmt = forb.createStatement();
	}

	public void sletAlleData() throws SQLException
	{
		stmt.execute("truncate table KUNDER");
	}

	public void opretTestdata() throws SQLException
	{
		try { // hvis tabellen allerede eksisterer opstår der en SQL-udtagelse
			stmt.executeUpdate(
				"create table KUNDER (NAVN varchar(32), KREDIT float)" );
		} catch (SQLException e) {
			System.out.println("Kunne ikke oprette tabel: "+e);
		}
		stmt.executeUpdate("insert into KUNDER values('Jacob', -1799)");
		stmt.executeUpdate("insert into KUNDER values('Brian', 0)");
	}

	public void indsæt(Kunde k) throws SQLException
	{
		stmt.executeUpdate("insert into KUNDER (NAVN,KREDIT) values('" 
			+ k.navn + "', " + k.kredit + ")");
	}

	public ArrayList<Kunde> hentAlle() throws SQLException
	{
		ArrayList<Kunde> alle = new ArrayList<Kunde>();
		ResultSet rs = stmt.executeQuery("select NAVN, KREDIT from KUNDER");
		while (rs.next())
		{
			// brug kolonneindeks i stedet for kolonnenavn
			Kunde k = new Kunde( rs.getString(1), rs.getDouble(2));
			alle.add(k);
		}
		return alle;
	}
}