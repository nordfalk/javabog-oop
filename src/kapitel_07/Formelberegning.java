package kapitel_07;
public class Formelberegning
{
	/**
	 * Finder første position af en operator, f.eks +, -, * eller /.
	 * Går uden om de operatorer, der er inde i en parentes.
	 * Simplel løsning, der ikke tager højde for parenteser: udtryk.indexOf(tegn)
	 */
	public static int findUdenforParenteser(char tegn, String udtryk)
	{
		int par = 0;
		for (int i = 0; i<udtryk.length(); i++)
		{
			char t = udtryk.charAt(i);
			if (t == tegn && par==0) return i; // tegn fundet udenfor parenteser!
			else if (t == '(') par++;          // vi går ind i en parentes
			else if (t == ')') par--;          // vi går ud af en parentes
		}
		return -1; // tegn ikke fundet udenfor parenteser
	}

	public static double beregn(String udtryk)
	{
		System.out.println("  beregn("+udtryk+") blev kaldt");
		udtryk = udtryk.trim();                  // fjern overflødige blanktegn
		for (int opNr = 0; opNr < 4; opNr++)     // løb gennem de fire regnearter
		{
			char op = "+-*/".charAt(opNr);        // op er nu '+', '-', '*' eller '/'
			int pos = findUdenforParenteser(op,udtryk);
			if (pos > 0)                           // findes op i udtrykket?
			{
				String vs = udtryk.substring(0,pos); // ja, find venstresiden
				String hs = udtryk.substring(pos+1); // find højresiden

				double vsr = beregn(vs);             // beregn venstresidens værdi
				System.out.println("beregn("+vs+") = "+vsr);

				double hsr = beregn(hs);             // beregn højresidens værdi
				System.out.println("beregn("+hs+") = "+hsr);

				if (op == '+') return vsr + hsr;     // beregn resultat og returnér
				if (op == '-') return vsr - hsr;
				if (op == '*') return vsr * hsr;
				return vsr / hsr;
			}
		}
		// Hvis vi kommer herned kunne der ikkes dele op i flere operatorer
		if (udtryk.startsWith("(") && udtryk.endsWith(")"))   // parenteser omkring?
		{
			udtryk = udtryk.substring(1,udtryk.length()-1);     // fjern dem
			return beregn(udtryk);                              // beregn indmad
		}
		if (udtryk.startsWith("sin(") && udtryk.endsWith(")"))// sinus-funktion
		{
			udtryk = udtryk.substring(4,udtryk.length()-1);    // fjern 'sin(' og ')'
			double resultat = beregn(udtryk);                   // beregn parameteren
			System.out.println("beregn("+udtryk+") = "+resultat);
			return Math.sin(resultat);
		}
		// intet andet fundet - så må det være et tal!
		return Double.parseDouble(udtryk);
	}

	public static void main(String[] arg)
	{
		String formel = "(1+2)*3 - sin(4/5*(6-7))";
		double værdi = beregn(formel);
		System.out.println("Formlen "+formel+" er beregnet til "+værdi);
	}
}