package ArrayProgram;

import java.util.Arrays;

public class ArrayQuestion05 {
	public static void main(String[] args) 
	{
		int marks[] = new int[5];
		marks[0] = 34;
		marks[1] = 56;
		marks[2] = 24;
		marks[3] = 89;
		marks[4] = 67;
		
		System.out.println(Arrays.toString(marks));
		
		int output[] = new int[5];
		
		for(int i=0; i<marks.length; i++)
			
		{
			output[i] = marks[i];
			
		}
		
		System.out.println(Arrays.toString(output));
		boolean b1 = Arrays.equals(marks, output);
		if(b1==true)
		{
			System.out.println("Both the Arrays are equal");
		}else {
			System.out.println("Both Arrays are not equals");
		}
		
	}

}
