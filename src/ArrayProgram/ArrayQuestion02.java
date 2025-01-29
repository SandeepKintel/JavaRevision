package ArrayProgram;

import java.util.Arrays;

public class ArrayQuestion02 
{
	public static void main(String[] args) 
	{
		int[] input = {13, 27, 21, 10, 12, 40, 24};
		System.out.println(Arrays.toString(input));
		reArrange(input);
		System.out.println(Arrays.toString(input));
		
		
	}
		public static void reArrange(int[] arr)
		{
			int start=0;
			int end =arr.length-1;
			
			while(start<end) {
				while(start<end && arr[start]%2==0)
				{
					start++;
				}
				
				while(start<end && arr[end]%2!=0)
				{
					end--;
				}
				
				if(start<end) 
				{
					int a = arr[start];
					arr[start]=arr[end];
					arr[end] = a;
				}
				
				
			}
			
		}
		
		
	}

