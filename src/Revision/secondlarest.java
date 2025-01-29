package Revision;

public class secondlarest {
	public static void main(String[] args) {
		int input[] = {12, 23, 45, 65, 34, 1, 3, 2};
		
		int largest = input[0];
		int seclargest = input[0];
		
		for(int i=0; i<input.length; i++)
		{
			if(input[i]>largest)
			{
				largest=input[i];
			}
			
			if(input[i]>seclargest && input[i]!=largest)
			{
				seclargest= input[i];
			}
		}
		
		System.out.println(largest);
		System.out.println(seclargest);
		

		
		
	}

}
