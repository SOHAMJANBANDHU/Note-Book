package classroom;
import java.util.Scanner;
public class p6 {

	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a = s.nextInt();
		
		double d[] = new double[a];
		
		for(int i=0;i<a;i++)
		{
			d[i] = i;
			System.out.println(d[i]);
		}
	}
}
