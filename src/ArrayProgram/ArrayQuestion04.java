package ArrayProgram;

import java.util.Arrays;

public class ArrayQuestion04
{
	public static void main(String[] args) 
	{
		int[] input = {0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1,};
		int start=0;
		int end = input.length-1;
		System.out.println(Arrays.toString(input));
		
		while(start<end)
		{
			while(start<end && input[start]==0)
			{
				start++;
			}
			
			while(start<end && input[end]!=0)
			{
				end--;
				
			}
			
			if(start<end)
			{
				int a=input[start];
				input[start]= input[end];
				input[end]=a;
			}
		}
		
		System.out.println(Arrays.toString(input));
		
	}

}
