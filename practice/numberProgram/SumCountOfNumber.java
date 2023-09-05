package numberProgram;

import java.util.Scanner;

public class SumCountOfNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number where till you want to add");
		int a = scanner.nextInt();
		int ans=0;
		for (int i = 0; i <= a; i++) {
			ans += i;
		}
		System.out.println("the sum of 1 to "+ a +" numbers is "+ ans);
	}
}
