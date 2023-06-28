class PowerOfSum 
{
	public static void main(String[] args) 
	{
		int a = 1234, sum = 0;
		/*while (a!=0)
		{
			int rem = a%10;
			int power = 1;
			for (int i=1;i<=3 ;i++ )
			{
				power = power*rem;
			}
			sum = sum+power;
			a = a/10;
		}*/

		for (int i=a;i!=0;i/=10)
		{
			int rem = i%10;
			int power = 1;
			for (int j=1;j<=3;j++)
			{
				power*=rem;
			}
			sum+=power;
		}
		System.out.println("sum of power is "+sum);
	}
}
