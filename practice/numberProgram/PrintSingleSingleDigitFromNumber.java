package numberProgram;

import java.util.Scanner;

public class PrintSingleSingleDigitFromNumber {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give an any number");
		long num = scanner.nextLong();
		
		
		long a = num;
		for (long i = a; i != 0; i/=10) {
			long rem = i%10;
			System.out.println(rem);
		}
	}
}
