package Revision;

import java.util.Arrays;

public class ArrayRev1602 {
	public static void main(String[] args) {
		int[] input = {45, 87, 56, 89};
		int[] output = new int[4];
		
		System.out.println(Arrays.toString(input));
		
		for(int i=0, j=output.length-1; i<input.length; i++, j--)
		{
			output[j] = input[i];		
		}
		
		System.out.println(Arrays.toString(output));
		
	}

}
