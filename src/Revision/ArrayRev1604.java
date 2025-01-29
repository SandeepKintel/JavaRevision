package Revision;

import java.util.Scanner;

public class ArrayRev1604 {
	public static void main(String[] args) {
		String marks[] = {"rahul", "aman", "tarun", "Naman"};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<marks.length; i++)
		{
			if(marks[i]==sc.next())
			{
				System.out.println("Entered String is part of array");
			}else {
				System.out.println("Entered String is not part of array");
			}
			
		}
	}

}
