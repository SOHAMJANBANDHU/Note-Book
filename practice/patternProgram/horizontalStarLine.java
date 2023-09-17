package patternProgram;

import java.util.Iterator;
import java.util.Scanner;

public class horizontalStarLine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int a = scanner.nextInt();
		for (int i = 0; i <= a; i++) {
			System.out.print("*");
		}
	}
}
