package kapitel_02;
public class Trekant
{
	public static void main(String[] arg) 
	{
		double a, b, hypotenuse;
		a = 3;
		b = 4;
		hypotenuse = Math.sqrt(a*a + b*b);
		System.out.println("En retvinklet trekant med sider "+a+" og "+b);
		System.out.println("har hypotenuse "+hypotenuse);
	}
}