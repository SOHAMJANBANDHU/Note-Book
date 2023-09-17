package patternProgram;

import java.util.Scanner;

public class SquareStar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scanner.nextInt();
		
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= a; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
