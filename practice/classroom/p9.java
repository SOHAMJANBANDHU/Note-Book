package classroom;

public class p9 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("addition of odd element");//.......ignore this statement.
		int ans = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				ans += i;//...........................don't mistaken try to understand this program 
			}
		}
		System.out.println(ans);
	}
}
