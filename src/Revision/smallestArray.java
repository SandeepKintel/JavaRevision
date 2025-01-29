package Revision;

public class smallestArray {
	public static void main(String[] args) {
		int input[] = {12, 23, 45, 65, 34, 1, 3, 2};
		
		int smallest = input[0];
		
		for(int i=0; i<input.length; i++)
		{
			if(input[i]<smallest)
			{
				smallest=input[i];
			}
		}
		
		System.out.println(smallest);
		
		
	}

}
