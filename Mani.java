class Akash
{
	public void bike()
	{
		System.out.print("bike is 390cc");
	}
	public void phone()
	{
		System.out.print("phone is iphone");
	}
}
class Arjun extends Akash
{ 
	public Arjun()
	  {
		System.out.println("Akash son is Arjun");
		
	  }
}
public class Mani
{
	public static void main (String[] arr)
	{ 
		Arjun a = new Arjun ();
		a.bike();
		a.phone();
		
		
	}
}