package Revision;

import java.util.Arrays;

public class ArrayRev06 {
	public static void main(String[] args) {
		int input[] = {27, 33, 36, 39, 10, 20, 40, 67};
		int start=0;
		int end = input.length-1;
		//System.out.println(Arrays.toString(input));
		
		while(start<end)
		{
			while(start<end && input[start]%2==0)
			{
				start++;
			}
			
			while(start<end && input[end]%2!=0)
			{
				end--;
			}
			
			if(start<end)
			{
			int a = input[start];
			input[start]=input[end];
			input[end]=a;	
			}
		}
		
		System.out.println(Arrays.toString(input));
		
	}

}


