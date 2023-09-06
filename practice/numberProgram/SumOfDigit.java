package numberProgram;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		
		int sum = 0;
		while(num != 0)
		{
			int rem = num%10;
			sum = sum+rem;
			num /= 10;
		}
		System.out.println("The sum of digits from given number is "+sum);
	}
}
