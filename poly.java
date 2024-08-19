import java.lang.*;
class Display
{
	void display()
	{
		System.out.println("no parameters");
	}
	void display(int x)
	{
		System.out.println("X:"+x);
	}
	void display(int x,int y)
	{
		System.out.println("X:"+x+"Y:"+y);
	}
	void display(double x)
	{
		System.out.println("X:"+x);
	}
	void display(String x)
	{
		System.out.println("X:"+x);
	}
/*error	int display()
	{
		System.out.println("no parameters");
		retun 0;
	}
	int display(int x,int y)
	{
		System.out.println("X:"+x+"Y:"+y);
		retun 0;
	}     error */
	int display(int x,int y,int z)
	{
		System.out.println("X:"+x+"Y:"+y+"Z:"+z);
		return 0;
	} 
	
}
class poly
{
	public static void main(String a[])
	{
		Display d=new Display();
		d.display();
		d.display(2);
		d.display(4,5);
		d.display(1.8980978);
		d.display("JAVA");
	//	int k=d.display(); // error 
	//	int r=d.display(5,4); // error
		int i=d.display(5,4,3);
	}

}