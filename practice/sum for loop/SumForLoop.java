import java.util.Scanner;
class SumForLoop 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int a = s.nextInt();

		int sum = 0;

		for (int i = 0; i<=a ; i++ )
		{
			sum = sum+i;
		
		}
		System.out.print("Sum: "+sum);
	}
}
