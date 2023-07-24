package notebook;

import java.util.ArrayList;

public class AL2 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList<>();
		
		a1.add("soham");
		a1.add(123);
		a1.add('a');//...................add(object j) method
		
		System.out.println(a1);
		//[soham, 123, a]
		
		/*~ we used add method to add element in the given list 
		 */
		
		a1.add(2, "Janbandhu");//........add(int index, object element) method in specified index
		
		System.out.println(a1);
		//[soham, 123, Janbandhu, a]
		
		
	}
}
