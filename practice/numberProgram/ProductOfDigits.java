package numberProgram;

import java.util.Scanner;

public class ProductOfDigits {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		
		int product = 1;
		while(num != 0)
		{
			int rem = num%10;
			product = product*rem;
			num /= 10;
		}
		System.out.println("The sum of digits from given number is "+product);
	}
}
