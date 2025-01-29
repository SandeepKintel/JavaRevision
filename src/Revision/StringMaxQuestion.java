package Revision;

public class StringMaxQuestion {
	public static void main(String[] args) {
		String input = "I am very big star and you are 0 infront of me I want 100 % and $ 300";
		int count_alpha = 0;
		int count_space = 0;
		int count_digit = 0;
		
		for(int i=0; i<input.length(); i++)
		{
			char ch = input.charAt(i);
			
			if(Character.isAlphabetic(ch))
			{
				count_alpha++;
			}else if(Character.isDigit(ch))
			{
				count_digit++;
			}else if(Character.isSpace(ch))
			{
				count_space++;
			}else
			{
				System.out.println("right");
			}
		}
		System.out.println(input.length());
		
		int count_specialChar = input.length()-(count_alpha+count_space+count_digit);
		
		System.out.println("Total Number of spaces are "+ count_space);
		System.out.println("Total number of alphabets are "+count_alpha);
		System.out.println("Total number of digits are "+ count_digit);
		System.out.println("Total number of special characters are "+count_specialChar);
	}

}
