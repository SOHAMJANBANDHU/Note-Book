package classroom;

public class p11 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("add odd index values");
		int ans =0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (i%2!=0) {
				
				ans += a[i];
			}
		}
		System.out.println(ans);
	}
}
