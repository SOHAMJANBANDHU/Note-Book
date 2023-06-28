import java.util.Scanner;
class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("enter a digit: ");
		int a = s.nextInt();
		
		int count = 0,sum=0;

		for (int i=a;i!=0;i/=10)
		{
			count++;
		}
		
		for (int i=a;i!=0;i/=10)
		{
			int rem = i%10;
			int power = 1;
			for (int j=1;j<=count;j++)
			{
				power*=rem;
			}
			sum +=power;
		}
		if (sum==a)
		{
			System.out.println("it is a Armstrong number");
		}
		else
		{
		System.out.println("it is not a Armstrong");
		}
	}
}
