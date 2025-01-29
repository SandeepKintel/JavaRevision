package ArrayProgram;

import java.util.Arrays;

public class ArrayQyestion01 
{
	public static void main(String[] args) 
	{
		int marks[]= new int[6];
		marks[0] = 67;
		marks[1] = 75;
		marks[2] = 40;
		marks[3] = 80;
		marks[4] = 45;
		marks[5] = 100;
		int i=0;
		int k=0;
		System.out.println(Arrays.toString(marks));
		
		
		int output[] = new int[6];
		for(i=0;i<marks.length; i++)
		{
			if(marks[i]%2==0)
			{
				output[i]=marks[i];
			}
		}
//		for(k=0;k<marks.length; k++)
//		{
//			if(marks[i]%2!=0)
//			{
//				output[k] = marks[k];
//			}
//		}
		
		System.out.println(Arrays.toString(output));
		
	}

}
