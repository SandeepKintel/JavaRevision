package ArrayRevision;

import java.util.Arrays;

public class IncedoArray {
	public static void main(String[] args) {
		int marks[]= {55,99,80,12,9};
		System.out.println(Arrays.toString(marks));
		
		int largest = 0;
		int seclargest = 0;
		
		
		for(int i=0; i<marks.length; i++)
		{
			if(seclargest>marks[i])
			{
				largest=seclargest;
			}
		}
	}
	

}
