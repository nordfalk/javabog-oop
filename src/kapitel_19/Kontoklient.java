package kapitel_19;
import java.rmi.Naming;
import java.util.ArrayList;

public class Kontoklient
{
	public static void main(String[] arg) throws Exception
	{
		KontoI k =(KontoI) Naming.lookup("rmi://localhost:1099/kontotjeneste");
    k.overførsel(100);
    k.overførsel(50);
		System.out.println( "Saldo er: "+ k.saldo() );
		k.overførsel(-200);
		k.overførsel(51);
		System.out.println( "Saldo er: "+ k.saldo() );
		ArrayList<String> bevægelser = k.bevægelser();

		System.out.println( "Bevægelser er: "+ bevægelser );
	}
}
/*
	long tid = System.currentTimeMillis();
	for (int i=0; i<100; i++) {
		k.overførsel(1);
		k.overførsel(-1);
	}
	long dt = System.currentTimeMillis() - tid;
	System.out.println( "Kørselstiden for RMI var: "+ dt );
*/
