package kapitel_04;
public class BenytPerson
{
	public static void main(String[] arg)
	{
		Person jacob = new Person("Jacob", "Nordfalk", 44);
		Person kai = new Person("Kai", "Lund", 86);
		Person lars = new Person("Lars", "Holm", 2);
		System.out.println("Vi har oprettet "+jacob+", "+kai+" og "+lars);

		jacob.præsentation();
		kai.præsentation();
		lars.præsentation();

		jacob.hils(kai);
		kai.hils(jacob);
		kai.hils(lars);
		lars.hils(jacob);
	}
}