package numberProgram;

import java.util.Scanner;

public class PrintNumberTable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find table");
		int a = scanner.nextInt();
		
		for (int i = 1; i < 10; i++)
		{
			int ans = i*a;
			System.out.println(ans);
		}
	}
}
