package kapitel_20;
import java.sql.*;
public class BenytTransaktioner
{
	public static void main(String[] arg) throws Exception
	{
		// Udskift med din egen databasedriver og -URL
		Class.forName("com.mysql.jdbc.Driver");
		Connection forb = DriverManager.getConnection("jdbc:mysql:///test");
    //forb.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
		forb.setAutoCommit(false);
		Statement stmt = forb.createStatement();
		System.out.println("forb.getTransactionIsolation() "+ forb.getTransactionIsolation());

		try {
	//		stmt.execute("SET AUTOCOMMIT=0");
	//		stmt.execute("START TRANSACTION");
			stmt.executeUpdate("insert into KUNDER values('Jacob', -1799)");
			stmt.executeUpdate("insert into KUNDER values('Brian', 0)");

			forb.commit();
		} catch (Exception e) {
			forb.rollback();
		}
		
//		stmt.execute("COMMIT");

	}
}