package notebook;

import java.util.ArrayList;

public class AL4 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList<>();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		System.out.println(a1);//.........[1,2,3,4]
		
		a1.remove(3);//..................remove(int index) method
		System.out.println(a1);//........[1,2,3]
		
		ArrayList a2 = new ArrayList<>();
		
		a2.add('a');
		a2.add('b');
		a2.add('c');
		a2.add('d');
		System.out.println(a2);
		
//		System.out.println(a2);
	}
}
