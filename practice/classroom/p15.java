package classroom;

public class p15 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		int count =0;
		System.out.print("even number are: ");
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0)
			{
				System.out.print(a[i] +" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("the count of even number are: "+count);
	}
}
