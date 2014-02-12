package kapitel_03;
import java.util.HashMap;
public class BenytHashMapOrdbog
{
	public static void main(String[] args)
	{
		HashMap<String,String> ord = new HashMap<String,String>();
		ord.put("granda", "stor");
		ord.put("longa", "lang");
		ord.put("bela", "smukt");
		ord.put("estas", "er");

		String esperantotekst = "longa, granda hundo estas.... bela!";

		for (String eoOrd : esperantotekst.split("\\b")) { // split efter ordgrænser
			String da = ord.get( eoOrd ); // slå esperantoord op og få det danske ord
			if (da == null) da=eoOrd;  // hvis intet fundet lader vi det stå uoversat
			System.out.print( da );
		}
	}
}