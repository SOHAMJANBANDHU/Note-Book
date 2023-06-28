import java.util.Scanner;
class DigitPrint 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = s.nextInt();
		
		//int rem = a%10; ------------------condition for extract value and store in rem
		//System.out.println(rem);---------- print only last value by cndition
		int rem = 0;//---------------------- Initialiation
		 while (a!=0)//------------------------- condition
		{
			rem = a%10;//----------------------- extraction last value
			System.out.println(rem);//---------- print all last value one by one
			a=a/10;//--------------------------- updatation(removing last value)
		}
		//System.out.println(rem);//-------------- print starting value
	}
}
