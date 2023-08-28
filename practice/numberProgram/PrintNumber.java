package numberProgram;
import java.util.Scanner;

class PrintNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value till where you want to print number...");
		
		int a = sc.nextInt();
		
		for(int i = 0; i<=a; i++)
		{
			System.out.println(i);
		}
		
	}
	
}
