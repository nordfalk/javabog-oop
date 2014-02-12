package kapitel_21;
import kapitel_05.*;
public class A
{
	public String navn ="Klasse A";

	class B
	{
		public String navn="Klasse B";

		class C
		{ 
			public String navn="Klasse C";

			public void skriv()
			{
				System.out.println(navn);
				System.out.println(this.navn);
				System.out.println(C.this.navn);
				System.out.println(B.this.navn);
				System.out.println(A.this.navn);
			}
		}
	}
}