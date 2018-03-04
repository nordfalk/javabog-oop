package kapitel_19.bank;
import java.rmi.Naming;
import java.rmi.RemoteException;
import kapitel_19.KontoI;
import kapitel_19.KontoImpl;
public class Bankserver
{
	public static void main(String[] arg) throws Exception
	{
		java.rmi.registry.LocateRegistry.createRegistry(1099);

		BankImpl b = new BankImpl();
		Naming.rebind("rmi://localhost/banktjeneste", b);
		System.out.println("Banktjeneste registreret.");

    while (true) {
      Thread.sleep(10000);
      KontoI yvonne = b.findKonto("Yvonne");
      if (yvonne==null) continue;
  		System.out.println("Yvonne får et stipendium på 1000 kr :-)");
      yvonne.overførsel(1000);
    }
	}
}
