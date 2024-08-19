import java.lang.*;
class parent
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
class Inheritance
{
	public static void main(String args[])
	{
		child k=new child();
		k.scooty();
		k.car();
		k.land();
	}
}
/*
	output:	pept
		Benz car
		panjagutta,5 acers
		 */


