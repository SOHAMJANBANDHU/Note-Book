package classroom;

public class p16 {

	public static void main(String[] args) {

		//minimum value
		
		int a[] = {4,3,2,5,6,8,7,9,1};
		int smallest = a[0];

		for (int i = 0; i < a.length; i++) {

			if(smallest>a[i])
			{
				smallest = a[i];
			}
			
		}
		System.out.println("smallest number of array is : "+ smallest);
	}
}
