import java.lang.*;
import java.util.*;
class area
{
	static double a,PI=3.14;
	static void operation()
	{
		int r=0;
		Scanner s=new Scanner(System.in);
		r=s.nextInt();
		a=PI*r*r;
		System.out.println(a);
	}		
}
class circlearea
{
	public static void main(String a[])
	{
		area.operation();
	}
}
