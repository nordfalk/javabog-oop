package kapitel_04;
import java.util.ArrayList;
public class Person
{
	public String fornavn;
	public String efternavn;
	public int alder;
	public ArrayList<Konto> konti; // bruges senere

	public Person(String fornavnP, String efternavnP, int alderP)
	{
		fornavn = fornavnP;
		efternavn = efternavnP;
		alder = alderP;
		konti = new ArrayList<Konto>(); // bruges senere
	}

	public String toString()
	{
		return fornavn+" "+efternavn+" ("+alder+" år)";
	}

	public void præsentation()
	{
		if (alder < 5) System.out.println("agyyy!");
		else if (alder < 70) System.out.println("Jeg er "+fornavn+" på "+alder);
		else System.out.println("Jeg er hr. "+efternavn+" på "+alder+" år.");
	}

	public void hils(Person andenPerson)
	{
		if (alder < 5) System.out.print("ma ma.. ");
		else if (andenPerson.alder < 10) System.out.print("Hej lille "+andenPerson.fornavn+".");
		else if (alder < 70) System.out.print("Hej "+andenPerson.fornavn+". ");
		else System.out.print("Goddag, hr. "+andenPerson.efternavn+". ");

		præsentation();
	}
}