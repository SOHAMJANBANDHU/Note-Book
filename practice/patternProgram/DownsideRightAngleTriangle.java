package patternProgram;

import java.util.Iterator;
import java.util.Scanner;

public class DownsideRightAngleTriangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scanner.nextInt();
		
		for (int i = 0; i <= a; i++) {
			
			for (int j = 0; j < a-i; j++) {
				
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
