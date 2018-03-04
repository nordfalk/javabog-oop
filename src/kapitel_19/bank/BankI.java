package kapitel_19.bank;

import java.util.ArrayList;
import kapitel_19.KontoI;

public interface BankI extends java.rmi.Remote {
  KontoI findKonto(String navn) throws java.rmi.RemoteException;
  ArrayList<String> hentAlleKontonavne() throws java.rmi.RemoteException;
  void registrérKonto(String navn, KontoI konto) throws java.rmi.RemoteException;
}
