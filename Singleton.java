package practice;

public class Singleton {

	static private Singleton a;
	
	private Singleton() 
	{
		
	}
	
	public static Singleton getObject()
	{
		if(a != null)
		{
			return a;
		}
		else
		{
			a = new Singleton();
			return a;
		}
	}
}
