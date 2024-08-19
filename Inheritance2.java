import java.lang.*;
class grandparent
{
	void documents()
	{
		System.out.println("land documents");
	}
	void voilen()
	{
		System.out.println("Antique voilen");
	}
}
class parent extends grandparent
{
	void car()
	{
		System.out.println("Benz car");
	}
	void land()
	{
		System.out.println("panjagutta,5 acers");
	}
}
class child extends parent
{
	void scooty()
	{
		System.out.println("pept");
	}
}
class Inheritance2
{
	public static void main(String args[])
	{
		child k=new child();
		k.scooty();
		k.car();
		k.land();
		k.voilen();
		k.documents();
	}
}
/* output:pept
Benz car
panjagutta,5 acers
Antique voilen
land documents */

