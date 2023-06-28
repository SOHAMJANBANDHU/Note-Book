import java.util.Scanner;
class WeirdNum
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int ip = s.nextInt();
		if (ip%2==0)
		{
			if (ip>=2 && ip<=5)
			{
				System.out.println("Not Weird Number");
			}
			else if (ip>=6 & ip<=20)
			{
				System.out.println("Weird Number");
			}
			else if (ip>20)
			{
				System.out.println("Not Werid Number");
			}
		}
		else
		{
			System.out.println("Weird Number");
		}
	}
}
