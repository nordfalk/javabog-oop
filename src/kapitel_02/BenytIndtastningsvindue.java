package kapitel_02;
public class BenytIndtastningsvindue
{
	public static void main(String[] arg)
	{
		String str = javax.swing.JOptionPane.showInputDialog("Indtast et tal");
		int svar = Integer.parseInt(str);

		System.out.println("Du indtastede "+svar+", det dobbelte er: " + 2*svar);
		javax.swing.JOptionPane.showMessageDialog(null, "Det dobbelte: " + 2*svar);

		int bekræft = javax.swing.JOptionPane.showConfirmDialog(null, "Er du OK?");
		if (bekræft != javax.swing.JOptionPane.YES_OPTION) {
			javax.swing.JOptionPane.showMessageDialog(null, "Aftal en tid hos lægen",
				"Et godt råd", javax.swing.JOptionPane.WARNING_MESSAGE);
		}
	}
}