package practice;

public class ReverseString {

	public static void main(String[] args) {
		
		String string = "Soham Janbandhu";
		
		String rev = "";
		
		for (int i = string.length()-1; i >= 0 ; i--)
		{
		
			rev += string.charAt(i);
		}
		System.out.println(rev);
	}
}
