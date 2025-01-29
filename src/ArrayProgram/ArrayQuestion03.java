package ArrayProgram;

import java.util.Arrays;

public class ArrayQuestion03 
{
	public static void main(String[] args) 
	{
		int[] input= {40, 13, 27, 21, 10, 12, 40, 24, 15};
		
		int start = 0;
		int end = input.length-1;
		
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
				int a=input[start];
				input[start] = input[end];
				input[end] = a;
			}
		}
		
		System.out.println(Arrays.toString(input));
	}

}
