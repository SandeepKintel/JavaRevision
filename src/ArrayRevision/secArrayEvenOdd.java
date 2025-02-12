package ArrayRevision;

import java.util.Arrays;

public class secArrayEvenOdd {
	
	public static void main(String[] args) {
		
		int input[] = {2,3,5,4,8,9,21,10,12};
		int output[] = new int[input.length];
		int k=0;
		
		
		for(int i=0; i<input.length; i++)
		{
			if(input[i]%2==0)
			{
				output[k++]=input[i];
				
			}
		}
		
		System.out.println(Arrays.toString(output));
		
		for(int i=0; i<input.length; i++)
		{
			if(input[i]%2!=0)
			{
				output[k++]=input[i];
				
			}
		}
		
		System.out.println(Arrays.toString(output));	
	}

	

}
