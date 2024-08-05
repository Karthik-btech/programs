import java.lang.*;
import java.util.*;
class student
{
	static String clg="LBRCE";
	String name;
	int rno;
	static String state="AP";
	void stdetails()
	{
		System.out.println("\nName:"+name+"\nCollege name:"+clg+"\nRoll number:"+rno+"\nState:"+state);
	}
}
class Students 
{
	public static void main(String A[])
	{
		student k=new student();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Student Name:");
		k.name=s.next();
		System.out.print("Enter Student R.no:");
		k.rno=s.nextInt();
		k.stdetails();
	}
}	


	


	
	