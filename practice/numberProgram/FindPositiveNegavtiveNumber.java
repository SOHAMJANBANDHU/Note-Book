package numberProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindPositiveNegavtiveNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find number is positive or not..");
		int a;
		try {
			a = scanner.nextInt();
			
			if(a>0)
			{
				System.out.println("Given number is positive");
			}
			else if (a<0)
			{
				System.out.println("Given number is negative");
			}
			else if (a==0)
			{
				System.out.println("Given number is equal to Zero");
			}	
		}
		catch (InputMismatchException e) 
		{
			System.out.println("Enter a number without decimal..");
		}
	
		scanner.close();
	}
}
