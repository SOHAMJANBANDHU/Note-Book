import java.util.Scanner;
class Swapping 
{
	public static void main(String[] args) 
	{
		Scanner Swap = new Scanner (System.in);

		System.out.print("Enter first number: ");
		double a = Swap.nextDouble();

		System.out.print("Enter Second number: ");
		double b = Swap.nextDouble();
		
		double temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping: "+a+" "+b);
	}
}
