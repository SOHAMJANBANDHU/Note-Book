package classroom;

import java.util.Iterator;

public class p13 {

	public static void main(String[] args) {
		
		int a[] = {9,8,7,6,5,4,3,2,1};
		
		System.out.println("copy the data of one array to second in reverse order");
		
		int b[] = new int[a.length];
		
		int j = b.length-1;
		
		for (int i = 0; i < b.length; i++) {
			
			b[i] = a[j];
			j--;
		}
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.print(b[i] + " ");
		}
	}
}
