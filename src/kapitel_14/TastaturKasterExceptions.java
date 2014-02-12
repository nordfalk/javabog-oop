package kapitel_14;
import java.io.*;

public class TastaturKasterExceptions
{
	private BufferedReader ind;

	public TastaturKasterExceptions()
	{
		ind = new BufferedReader(new InputStreamReader(System.in));
	}

	public String læsLinje() throws IOException
	{
		String linje = ind.readLine();
		return linje;
	}

	public double læsTal() throws IOException
	{
		String linje = læsLinje();
		return Double.parseDouble(linje);
	}
}