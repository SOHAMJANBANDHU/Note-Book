package classroom;

public class p8 {

	public static void main(String [] args)
	{
		int a[] = {7,8,9,5,6,1,74,6};
		
		System.out.println("actual array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("element present in even position");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]);	
			}
		}
		System.out.println("element which are even number");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
	}
}
