import java.lang.*;
class ra
{
	void show()
	{
		System.out.println("raju ");
	}
	void display()
	{
		System.out.println("love ");
	}
	static void mul()
	{
		int a,k=6;
		a=k*7;
		System.out.println(a);
	}
	static void add()
	{
		int a=18;
		a=a+a;
		System.out.println(a);
	}
}
class ju
{
	public static void main(String arg[])
	{
		ra.mul();
		ra.add();
		ra m=new ra();
		m.show();
		m.display();
		m.mul();
		m.add();
	}
}
		

		