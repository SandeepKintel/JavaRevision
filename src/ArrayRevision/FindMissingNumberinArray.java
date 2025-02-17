package ArrayRevision;

import java.util.Arrays;

public class FindMissingNumberinArray {
	public static void main(String[] args) {
		int[] Input= {1, 2, 4, 5, 6, 8};
		System.out.println(Arrays.toString(Input));
		
		for(int i=0; i<Input.length; i++)
		{
			if(Input[i+1]!=Input[i]+1)
			{
				int num=Input[i+1]-1;
				System.out.println("The missing number is "+num);
			}
		}
		
	}

}
