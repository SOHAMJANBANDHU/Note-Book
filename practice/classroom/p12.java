package classroom;

public class p12 {

	public static void main(String[] args) {
		
		int a[] = {9,8,7,6,5,4,3,2,1};
		
		System.out.println("copy the data of one array to second");
		
		int b[] = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			
			b[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.print(b[i] + " ");
		}
	
	}

}
