package kapitel_19;
import java.util.ArrayList;
import java.rmi.server.UnicastRemoteObject;

public class KontoImpl extends UnicastRemoteObject implements KontoI
{
	public int saldo;
	public ArrayList bevægelser;

	public KontoImpl() throws java.rmi.RemoteException 
	{
		// man starter med 100 kroner
		saldo = 100;
		bevægelser = new ArrayList();
	}

	public void overførsel(int kroner)
	{
		saldo = saldo + kroner;
		String s = "Overførsel på "+kroner+" kr. Ny saldo er "+saldo+" kr.";
		bevægelser.add(s);
		System.out.println(s);
	}

	public int saldo()
	{
		System.out.println("Der spørges om saldoen. Den er "+saldo+" kr.");
		return saldo;
	}

	public ArrayList bevægelser()
	{
		System.out.println("Der spørges på alle bevægelser.");
		return bevægelser;
	}
}