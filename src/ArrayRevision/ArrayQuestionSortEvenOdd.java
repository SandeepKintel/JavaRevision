package ArrayRevision;

import java.util.Arrays;

public class ArrayQuestionSortEvenOdd {
	public static void main(String[] args) {
		int input[]= {0,1,3,0,6,0,0,2,0};
		int left=0;
		int right=input.length-1;
		int num=0;
		
		while(left<right)
		{
			while(left<right && input[left]==0)
			{
				left++;
			}
			
			while(left<right && input[right]!=0)
			{
				right--;
			}
			if(left<right)
			{
				num=input[left];
				input[left]=input[right];
				input[right]=num;
			}

		}
		System.out.println(Arrays.toString(input));
	}

}
