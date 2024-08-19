import java.lang.*;
class abc
{
	int rno;
	String name;
	abc()
	{
		int rno=518;
		String name="karthik";
		System.out.println("ROLL NO:"+rno+"Name:"+name);
	}
	abc(int k,String a)
	{
		int rno=k;
		String name=a;
		System.out.println("ROLL NO:"+rno+"Name:"+name);
	}
}
class constructor2
{
	public static void main(String args[])
	{
		abc k=new abc();
		abc a=new abc(19,"raju");
	}
}
/* outpu :
ROLL NO:518Name:karthik
ROLL NO:19Name:raju */