package kapitel_18;
import java.io.*;
public class Data implements Serializable
{
	public int a;
	public transient int tmp;		// transiente data bliver ikke serialiseret

	// Vigtigt: Sæt versionsnummer så objekt kan læses selvom klassen er ændret!
	private static final long serialVersionUID = 12345; // bare et eller andet nr.

	public String toString()
	{ 
		return "Data: a="+a+" tmp="+tmp;
	}
}