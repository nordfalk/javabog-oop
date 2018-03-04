package kapitel_19.bank;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import kapitel_19.KontoI;

public class BankImpl extends UnicastRemoteObject implements BankI {

  HashMap<String, KontoI> navnTilKonto = new HashMap<>();

  public BankImpl() throws java.rmi.RemoteException {
  }

  @Override
  public KontoI findKonto(String navn) throws RemoteException {
    System.out.println("findKonto(" + navn);
    return navnTilKonto.get(navn);
  }

  @Override
  public ArrayList<String> hentAlleKontonavne() throws RemoteException {
    System.out.println("hentAlleKontonavne()");
    return new ArrayList<>(navnTilKonto.keySet());
  }

  @Override
  public void registrérKonto(String navn, KontoI konto) throws RemoteException {
    if (navnTilKonto.containsKey(navn)) {
      throw new IllegalArgumentException("Konto er allerede registreret for "+navn);
    }
    System.out.println("registrérKonto " + navn + " " + konto);
    navnTilKonto.put(navn, konto);
  }
}
