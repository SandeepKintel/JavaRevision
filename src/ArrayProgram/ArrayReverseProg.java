package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseProg {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int cap = sc.nextInt();
		int input[] = new int[cap];
		input[0] = 98;
		input[1] = 45;
		input[2] = 78;
		input[3] = 56;
		
		int output[] = new int[4];
		
		for(int i=0, j=output.length-1; i<input.length; i++, j--)
		{
			output[j] = input[i];
		}
		System.out.println(Arrays.toString(output));
		
		
	}

}
