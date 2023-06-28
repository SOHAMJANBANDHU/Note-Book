import java.util.Scanner;
class BuzzNum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = s.nextInt();

		if (a%10==0 || a%7==0)
		{
			System.out.println("It is a Buzz Number");
		}
		else
		{
			System.out.println("It is not a Buzz Number");
		}
	}
}
