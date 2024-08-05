class staticvar
{
	static int a=18;
	static float b=1.8F;
	static double c=354563;
}
class callst
{
	public static void main(String ak[])
	{
		staticvar s=new staticvar();
		System.out.println(" "+s.a+" "+s.b+" "+s.c);
	}
}