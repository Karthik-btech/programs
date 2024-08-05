import java.lang.*;
import java.util.*;
class b
{
	static void math(int s)
	{ 
		double r=Math.pow(s,2);
		System.out.println(r);
	}
}
class builtin
{
	public static void main(String a[])
	{
		int k;
		Scanner n=new Scanner(System.in);
		k=n.nextInt();
		b.math(k);
	}
}				