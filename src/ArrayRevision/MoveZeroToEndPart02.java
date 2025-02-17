package ArrayRevision;

import java.util.Arrays;

public class MoveZeroToEndPart02 {
	public static void main(String[] args) {
		int[] input= {1, 2, 0, 3, 0, 0, 4, 2, 6, 8, 10, 8, 3};
		int start=0; 
		int end= input.length-1;
		//System.out.println(Arrays.sort(input));
		
//		while(start<end)
//		{
//			while(start<end && input[start]!=0)
//			{
//				start++;
//			}
//			
//			while(start<end && input[end]==0)
//			{
//				end--;
//			}
//			
//			if(start<end)
//			{
//				int num=input[start];
//				input[start]=input[end];
//				input[end]=num;
//				start++;
//			}
//		}
		for(int i=0; i<input.length; i++)
		{
			if(input[i]!=0)
			{
				int num=input[start];
				input[start]=input[i];
				input[i]=num;
				start++;	
			}
		}
		
		System.out.println(Arrays.toString(input));
	}

}
