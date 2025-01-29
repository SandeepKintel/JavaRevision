package Revision;

import java.util.Arrays;

public class ArrayRev16 {
	public static void main(String[] args) 
	{
		int[] input = {34, 56, 32, 45};
		int[] output = new int[4];
		
		System.out.println(Arrays.toString(input));
		
		for(int i=0; i<input.length; i++)
		{
			output[i] = input[i];
		}
		
		System.out.println(Arrays.toString(output));
		
		boolean b1 = Arrays.equals(input, output);
		if(b1==true)
		{
			System.out.println("two arrays are equal");
		}else {
			System.out.println("not equals");
		}
	}

}
