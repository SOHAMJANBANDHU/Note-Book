package practice;

import java.util.Iterator;

public class ReverseWithSpecific {
	
public static void main(String[] args) {
		
		String string = "This is a Soham Janbandhu";
		
		String[] result = string.split(" ");
		
		for (int i = 0; i < result.length; i++) {
			
			char[] check = result[i].toCharArray();
			
			String change = "";
			
			if(check.length>4)
			{
				for(int j=check.length-1;j>=0;j--)
				{
					change += result[i].charAt(j);
				}
				System.out.print(change +" ");
			}else {
				System.out.print(result[i] +" ");
			}
			
			
		}
	}

}
