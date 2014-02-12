package kapitel_19;
import java.util.ArrayList;

public interface KontoI extends java.rmi.Remote
{
	public void overførsel(int kroner) throws java.rmi.RemoteException;
	public int saldo()                 throws java.rmi.RemoteException;
	public ArrayList bevægelser()      throws java.rmi.RemoteException;
}