import java.util.Scanner;
class  Soham
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int ip = s.nextInt();
		int ans = ip%2;

		if (ans==0)
		{
			System.out.println("Weird Number");
		}
		else if (ans==0 && ans>=2 && ans<=5)
		{
			System.out.println("Not Weird Number");
		}
		else if (ans==0 && ans>=6 && ans<=20)
		{
			System.out.println("Weird Number");
		}
		else if (ans==0 && ans>20)
		{
			System.out.println("Not Weird Number");
		}

		/* if (ip%2==0)
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
		} */
	}
}
