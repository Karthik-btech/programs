import java.lang.*;
import java.util.*;
class facto
{
	void cal(int x)
	{
		int n=1;
		for(int i=1;i<=x;i++)
		{
			n=n*i;
		}
	System.out.println("factorial:"+n);
	}
}
class factorial
{
	public static void main(String k[])
	{
		facto s=new facto();
		s.cal(Integer.parselong(k[0]));
	}
}
		