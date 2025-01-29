package Revision;

public class LargestArray {
	public static void main(String[] args) {
		int input[] = {23, 24, 56, 34, 87, 467, 2};
		
		int largest=input[0];
		
		for(int i=0; i<input.length; i++)
		{
			if(input[i]>largest)
			{
				largest=input[i];
			}
		}
		System.out.println(largest);
	}

}
