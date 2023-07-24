package classroom;
import java.util.Iterator;
import java.util.Scanner;

public class p14 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		int a = sc.nextInt();
		
		int b[] = new int[a];
		
		for (int i = 0; i < b.length; i++) {
			
			b[i] = i;
			if(b[i]%2==0)
			{
				System.out.println(b[i]);
			}
		}	
	}
}
