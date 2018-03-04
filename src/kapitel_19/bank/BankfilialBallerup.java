package kapitel_19.bank;
import java.rmi.Naming;
import java.util.ArrayList;
import kapitel_19.KontoI;
import kapitel_19.KontoImpl;

/**
 * Illustration af callbacks over RMI
 * Denne klient registrerer sine egne Remote objekter (KontoImpl) i serverens Bank-objekt
 * Andre klienter kan slå
 * @author j
 */
public class BankfilialBallerup
{
	public static void main(String[] arg) throws Exception
	{
    System.out.println("\n\n--- BankfilialBallerup ---\n\n");
		BankI b =(BankI) Naming.lookup("rmi://localhost/banktjeneste");

    ArrayList<String> kontohavere = b.hentAlleKontonavne();
    System.out.println("Alle kontohavere "+kontohavere);

    if (!kontohavere.contains("Jacob")) {
      b.registrérKonto("Jacob", new KontoImpl());
      b.registrérKonto("Bo", new KontoImpl());
    }

    KontoI k = b.findKonto("Jacob");
    k.overførsel(100);
		System.out.println( "Jacobs saldo er: "+ k.saldo() );
	}
}
