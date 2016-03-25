package kapitel_20;
import java.sql.*;
public class SimpeltDatabaseeksempel
{
	public static void main(String[] arg) throws Exception
	{
		// Udskift med din egen databasedriver og -URL
		Class.forName("com.mysql.jdbc.Driver");
		Connection forb = DriverManager.getConnection("jdbc:mysql:///test");
		Statement stmt = forb.createStatement();

    //stmt.executeUpdate("create table KUNDER (NAVN varchar(32), KREDIT float)" );

    stmt.executeUpdate("insert into KUNDER values('Jacob', -1799)");
    stmt.executeUpdate("insert into KUNDER values('Robert\\'); drop table KUNDER; -- ', 0)");
      
      		// forespørgsler
		ResultSet rs = stmt.executeQuery("select NAVN, KREDIT from KUNDER");
		while (rs.next())
		{
      String navn = rs.getString("NAVN");
      double kredit = rs.getDouble("KREDIT");
			System.out.println(navn+" "+kredit);
		}
  }
}
