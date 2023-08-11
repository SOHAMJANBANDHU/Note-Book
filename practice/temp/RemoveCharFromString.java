package practice;

public class RemoveCharFromString {

	public static void main(String[] args) {
		
		
		String remove = removeChar("Aeroplane new",'e');
		System.out.println(remove);
		
		System.out.println(replaceChar("Pakistan",'k','p'));
	}

	public static String removeChar(String ip, char ch)
	{
		String ans = "";
		for (int i = 0; i < ip.length(); i++) {
			
			if(ip.charAt(i) != ch)
			{
				ans = ans + ip.charAt(i);
			}
		}
		return ans;
	}
	
	public static String replaceChar(String ip, char old, char neww)
	{
		String ans = "";
		
		for(int i = 0 ; i<ip.length(); i++)
		{
			if(ip.charAt(i) != old)
			{
				ans += ip.charAt(i);
				
			}
			else if (ip.charAt(i) == old) 
			{
			
				ans += neww;
			}
			
		}
		return ans ;
	}
}
