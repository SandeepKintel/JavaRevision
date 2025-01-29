package Revision;

public class StringTestExp 
{
	public static void main(String[] args) 
	{
		String input = "first";
		StringBuffer input2 = new StringBuffer("name");
		
		for(int i = 0; i<1000; i++) 
		{
			input = input.concat(" test");
		}	
		System.out.println(input);
		
		for(int i=0; i<1000; i++)
		{
			input2 = input2.append(" test");
		}
		
		System.out.println(input2);
			
	}

}
