package ArrayRevision;

import java.util.Arrays;

public class MoveAllZeroToEnd {
	public static void main(String[] args) {
		int[] input= {0, 1, 0, 3, 12};
		System.out.println("The input is "+Arrays.toString(input));
		int start=0;
		int end= input.length-1;
		
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
