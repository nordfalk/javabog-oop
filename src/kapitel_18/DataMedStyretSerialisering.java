package kapitel_18;
import java.io.*;
public class DataMedStyretSerialisering implements Serializable
{
	public int a;
	public int tmp;  // tmp behøves ikke mere at erklæres transient,
	                 // da vi selv sørger for serialiseringen

	public String toString()
	{ 
		return "Data: a="+a+" tmp="+tmp;
	}

	private void writeObject(ObjectOutputStream out) throws IOException
	{
		out.writeInt(a);  // gem kun a, ikke tmp
	}

	private void readObject(ObjectInputStream in) throws IOException,
	                                                     ClassNotFoundException
	{
		a = in.readInt();
	}
}