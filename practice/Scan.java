import java.util.Scanner;
class Scan 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter int");
		int i = scan.nextInt();
		System.out.println("Enter double");
        	double d = scan.nextDouble();
		scan.nextLine();
		System.out.println("Enter String");
        	String s = scan.nextLine();
		System.out.println("Enter int");
		int k = scan.nextInt();

		System.out.println("Int: " + k);
		System.out.println("String: " + s);
       	 	System.out.println("Double: " + d);
        	System.out.println("Int: " + i);
    
	}
}
