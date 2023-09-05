package numberProgram;

import java.util.Scanner;

public class NumberDigitCount {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give an any number");
		long num = scanner.nextLong();
		
		int count=0;
		
		while (num != 0) {
			num = num/10;
			count++;
		}
		System.out.println("The digit present in given number is "+count);
	}
}
