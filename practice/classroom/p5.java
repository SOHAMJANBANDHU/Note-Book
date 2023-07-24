package classroom;

public class p5 {

	public static void main(String [] args)
	{
		String s[] =  new String [3];
		
		s[0] = "soham";
		s[1] = "vaibhav";
		s[2] = "ankit";
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		for (int i = s.length-1; i >=0 ; i--) {
			System.out.print(s[i] + " ");
			
		}
	}
}
