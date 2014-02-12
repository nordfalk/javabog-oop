package kapitel_03;
// Viser brugen af StringBuilder-klassen og dens metoder.
public class BenytStringBuilder {
	public static void main (String[] arg)
	{
		StringBuilder sb;
		sb = new StringBuilder("At være");
		sb.append(" eller ");
		sb.append("ikke være");
		System.out.println("sb er nu: "+sb);
		sb.insert(8,"I FRED ");
		System.out.println("sb er nu: "+sb);
		sb.reverse();
		System.out.println("sb er nu: "+sb);
		sb.setLength(2);
		System.out.println("sb er nu: "+sb);
	}
}