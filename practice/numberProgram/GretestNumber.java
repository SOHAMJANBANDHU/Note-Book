package numberProgram;

import java.util.Scanner;

public class GretestNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scanner.nextInt();
		System.out.println("Enter Second number");
		int b = scanner.nextInt();
		System.out.println("Enter third number");
		int c = scanner.nextInt();
		
		int ans = a>b ? (a>c ? a : c) : (b>c ? b : c);
		
		System.out.println(ans +" This number is greatest");
	}
}
