package numberProgram;

import java.util.Scanner;

public class PrintOddNumber {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Starting number");
		int a = scanner.nextInt();
		System.out.println("Enter a ending number");
		int b = scanner.nextInt();
		
		for (int i = a; i < b; i++)
		{
			if (i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
