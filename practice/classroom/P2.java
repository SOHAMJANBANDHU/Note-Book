package classroom;

import java.util.Iterator;

public class P2 {

	public static void main(String[] args) {
		
		int a[]= new int[4];
		for (int i = 0; i < a.length; i++) {
			a[i]=i;
		}
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		System.out.println(a[2]);
	}
}
