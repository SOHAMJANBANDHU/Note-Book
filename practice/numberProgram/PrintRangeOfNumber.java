package numberProgram;
import java.util.Scanner;
public class PrintRangeOfNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting number");
		int a = sc.nextInt();
		
		System.out.println("enter ending number");
		int b = sc.nextInt();
		System.out.println(b);
		
		System.out.println();
		
	}
	
	public static void numLine(int a,int b)
	{
		for(int i = a; i<=b ;i++)
		{
			System.out.println(i);
		}
	}

}
