package notebook;

import java.util.ArrayList;

public class AL3 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList<>();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		System.out.println(a1);//.........[1,2,3,4]
		
		ArrayList a2 = new ArrayList<>();
		
		a2.add('a');
		a2.add('b');
		a2.add('d');
		System.out.println(a2);//.........[a,b,d]
		
		a2.add(2, 'c');//................add(int index,e element) method
		System.out.println(a2);//.........[a,b,c,d]
		
		a2.addAll(a1);//................addAll(collection c) method
		System.out.println(a2);//.......a2- [1,2,3,4,a,b,c,d]
		
		a1.addAll(3, a2);//.............addAll(int index, collection c) method
		System.out.println(a1);//.......a1- [1,2,3,a,b,c,d,4] (concept wise)
		
		
	}
}
