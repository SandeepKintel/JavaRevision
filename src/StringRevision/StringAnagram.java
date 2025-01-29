package StringRevision;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) 
	{
		String input= "silent";
		String output= "listen";
		
		if(input.length()==output.length()) {
			System.out.println("lets verify");
			char ch[] = input.toCharArray();
			char ch1[] = output.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch);
			
			boolean b1=Arrays.equals(ch, ch1);
			if(b1==true)
			{
				System.out.println("Strings are anagram");
			}
			

		}
		
		
		
	}

}
