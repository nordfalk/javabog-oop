package kapitel_02;
public class BenytIndtastningsvindue
{
	public static void main(String[] arg)
	{
		String str = javax.swing.JOptionPane.showInputDialog("Indtast et tal");
		int svar = Integer.parseInt(str);

		System.out.println("Du indtastede "+svar+", det dobbelte er: " + 2*svar);

		str = javax.swing.JOptionPane.showInputDialog("Indtast et kommatal");
		double svar2 = Double.parseDouble(str);

		System.out.println("Du indtastede "+svar2+", det halve er: " + 0.5*svar2);

	}
}