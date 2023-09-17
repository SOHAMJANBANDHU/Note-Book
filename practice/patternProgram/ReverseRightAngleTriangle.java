package patternProgram;

import java.util.Scanner;

public class ReverseRightAngleTriangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scanner.nextInt();
		
		for (int i = 0; i <= a; i++) {
			
			for (int j = 0; j < a-i; j++) {
				
				System.out.print(" "+" ");
			}
			for (int j = 0; j < i; j++) {
				
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
