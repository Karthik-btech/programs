import java.lang.*;
class addition
{
	void add()
	{
		System.out.println("Sum:0");
	}
	void add(int x)
	{
		x=x+x;
		System.out.println("Sum:"+x);
	}
	void add(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println("Sum:"+z);
	}
	void add(double x,double y)
	{
		double z;
		z=x+y;
		System.out.println("Sum:"+z);
	}
	void add(String x,String y)
	{
		String k=x+y;
		System.out.println("Concatanation:"+k);
	}
}
class poly2
{
	public static void main(String a[])
	{
		addition k=new addition();
		k.add();
		k.add(5);
		k.add(5,4);
		k.add(3.898989,9.343434);
		k.add("KAR","THIK");
	}
}
/*output:Sum:0
Sum:10
Sum:9
Sum:13.242423
Concatanation:KARTHIK */
		