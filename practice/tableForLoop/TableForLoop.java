import java.util.Scanner;
class TableForLoop 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int a = s.nextInt();

		for (int i=0; i<=10 ; i++ )
		{
			System.out.println(i*a);
		}
	}
}
