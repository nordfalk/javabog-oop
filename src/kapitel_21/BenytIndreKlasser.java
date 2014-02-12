package kapitel_21;
import kapitel_05.*;
public class BenytIndreKlasser
{
	public static void main(String[] arg) {
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.skriv();
	}
}