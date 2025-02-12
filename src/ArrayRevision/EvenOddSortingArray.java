package ArrayRevision;

import java.util.Arrays;

public class EvenOddSortingArray {
	public static void main(String[] args) {
		int input[]= {6,3,5,9,4,7,10,2};
		int start=0;
		int end= input.length-1;
		
		while(start<end)
		{
			if(start<end && input[start]%2==0)
			{
				start++;
			}
			
			if(start<end && input[start]!=0)
			{
				end--;
			}
			
			if(start<end)
			{
				int num=input[start];
				input[start]=input[end];
				input[end]=num;
			}
		}
		
		System.out.println(Arrays.toString(input));
	}

}
