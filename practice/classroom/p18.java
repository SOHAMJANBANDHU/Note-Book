package classroom;

public class p18 {
	
	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6,8,9,7,10};
		// 2nd minimum
		
		int min = a[0];
		int secmin = a[1];
		
		for (int i = 0; i < a.length; i++) {
			
			if(min > a[i] )
			{
				secmin = min;
				min = a[i];
			}
		}
		System.out.println(secmin);
	}

}
