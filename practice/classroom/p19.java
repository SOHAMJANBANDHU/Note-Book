package classroom;

public class p19 {

	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6,7,8,9};
		
		int prime[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			
//			isPrime(a[i]);
			for (int j = 1; j < prime.length; j++) {
				
				if(a[i]%j==0)
				{
					System.out.println("is not a prime "+a[i]);
					
				}
			
			}
			
			System.out.println(a[i]);
		}
		
		
	}
	public static void isPrime(int num)
	{
		for (int j = 1; j < num; j++) {
			
			if(num%j==0)
			{
				return;
			}
		}
		System.out.println(num + " is a prime");
	}
}
