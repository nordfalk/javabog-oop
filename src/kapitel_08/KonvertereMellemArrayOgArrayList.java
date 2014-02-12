package kapitel_08;
import java.util.*;
public class KonvertereMellemArrayOgArrayList
{
	public static void main(String[] arg)
	{
		String[] mdrA = {"januar", "februar", "marts", "april", "maj" };
		
		List<String> mdrL = Arrays.asList( mdrA );         // konvertér til liste..
		ArrayList<String> mdrAL = new ArrayList<String>( mdrL ); // ...og ArrayList

		// supernem måde at udskrive ethvert array af objekter
		System.out.println("Nogle måneder: " + Arrays.asList( mdrA ) );

		// initialisering af liste v.hj.a. Arrays.asList():
		List<String> mdrL2 = Arrays.asList( 
			new String[] {"januar", "februar", "marts", "april", "maj" }
		);

		// initialisering af ArrayList v.hj.a. Arrays.asList():
		ArrayList<String> mdrAL2 = new ArrayList<String>( Arrays.asList(
			new String[] {"januar", "februar", "marts", "april", "maj" }
		));

		// konvertering tilbage igen til array		
		String[] mdrA2 =  mdrAL.toArray(new String[0]);
	}
}