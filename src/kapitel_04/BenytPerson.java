package kapitel_04;
public class BenytPerson
{
	public static void main(String[] arg)
	{
		Person j, k, l;
		j = new Person("Jacob", "Nordfalk", 30);
		k = new Person("Kai", "Lund", 86);
		l = new Person("Lars", "Holm", 2);

		System.out.println("Vi har oprettet "+j+", "+k+" og "+l);
		j.præsentation();
		k.præsentation();
		l.præsentation();
		j.hils(k);
		k.hils(j);
		l.hils(j);
	}
}