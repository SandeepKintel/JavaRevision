package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRev1603 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input[] = {56, 78, 54, 87};
		    
		for(int i=0; i<input.length; i++)
		{
			input[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(input));
	}

}
