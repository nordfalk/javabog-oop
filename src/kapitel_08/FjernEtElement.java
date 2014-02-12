package kapitel_08;
public class FjernEtElement
{
	public static void main(String[] arg)
	{		
		// Oprettelse og initialisering af array
 		int[] a = new int[10];
		for (int n=0; n<a.length; n=n+1) a[n]=n*10;

		// Gennemløb og udskrivning af array 	
		System.out.print("a før: ");
 		for (int n=0; n<a.length; n=n+1) System.out.print(a[n]+" ");
 		System.out.println();

		// Kopiering af array / udtagning af element
		int fjernes=5;        // Element nr 5 skal fjernes.

		int[] tmp=new int[9]; // Nyt array med 9 pladser

		// bemærk at elementet der skal fjernes ikke kopieres
		for (int n=0; n<fjernes; n=n+1) tmp[n]=a[n];

		for (int n=fjernes+1; n<a.length; n=n+1) tmp[n-1]=a[n];

		a=tmp;                // Nu refererer a til det nye array med 9 elementer

		System.out.print("a efter: ");
		for (int n=0; n<a.length; n=n+1) System.out.print(a[n]+" ");
		System.out.println();
	}
}