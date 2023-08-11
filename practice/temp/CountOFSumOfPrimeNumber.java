package practice;

import java.util.Scanner;

public class CountOFSumOfPrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting of number");
		int num1= scanner.nextInt();
		System.out.println("Enter Ending of number");
		int num2= scanner.nextInt();
		int i,j;
		int sum=0;
		for ( i = num1; i <=num2; i++) 
		{
			for(j= 2; j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(i==j)
			{
				System.out.println(i);
				sum += i;
				
			}
		}
		System.out.println("sum of prime number is: "+sum);
	}
}
