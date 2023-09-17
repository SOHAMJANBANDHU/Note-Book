package patternProgram;

import java.util.Iterator;
import java.util.Scanner;

public class RightAngleStar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scanner.nextInt();
		
		for (int i = 0; i <=a ; i++) {
			
			for (int j = 0; j <=a ; j++) {
				
				if (i==0 || j==a) {
					System.out.print("*"+" ");
				} else {
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
	}
}
