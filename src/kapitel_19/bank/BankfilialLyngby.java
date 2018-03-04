package kapitel_19.bank;

import java.rmi.Naming;
import java.util.ArrayList;
import kapitel_19.KontoI;
import kapitel_19.KontoImpl;

public class BankfilialLyngby {

  public static void main(String[] arg) throws Exception {
    System.out.println("--- BankfilialLyngby ---");
    BankI b = (BankI) Naming.lookup("rmi://localhost/banktjeneste");

    ArrayList<String> kontohavere = b.hentAlleKontonavne();
    System.out.println("Alle kontohavere " + kontohavere);

    if (!kontohavere.contains("Yvonne")) {
      b.registrérKonto("Yvonne", new KontoImpl());
      b.registrérKonto("Anne", new KontoImpl());
    }

    System.out.println("Anne overfører 10 kroner til Bo");
    KontoI bo = b.findKonto("Bo");
    KontoI anne = b.findKonto("Anne");

    bo.overførsel(10);
    anne.overførsel(-10);  // hvad gør vi denne overførsel fejler?

    for (String navn : b.hentAlleKontonavne()) {
      KontoI k = b.findKonto(navn);
      System.out.println(navn + " saldo: " + k.saldo() + "  - " + k.bevægelser());
    }
  }
}
