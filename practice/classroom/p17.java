package classroom;

public class p17 {

	public static void main(String[] args) {

		//biggest value
		
		int a[] = {4,3,2,5,6,8,7,9,1};
		int biggest = a[0];

		for (int i = 0; i < a.length; i++) {

			if(biggest<a[i])
			{
				biggest = a[i];
			}
			
		}
		System.out.println("smallest number of array is : "+ biggest);
	}
}
