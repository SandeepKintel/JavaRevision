package StringRevision;

import java.util.Arrays;

public class AnagramExp 
{
	public static void main(String[] args) 
	{
		String name1 = "silent";
		String name2 = "listen";
		
		System.out.println(name1.replaceAll("[a-z]", "2"));
		
		if(name1.length()!=name2.length())
		{
			System.out.println("Not Anagram");
		}else {
			System.out.println("Lets find out");
			char[] ch1 = name1.toCharArray();
			char[] ch2 = name2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			System.out.println(Arrays.toString(ch1));
			System.out.println(Arrays.toString(ch2));
			
			boolean b1= Arrays.equals(ch1, ch2);
			if(b1==true)
			{
				System.out.println("given strings are anagram");
			}else {
				System.out.println("do not anagram");
			}
			


	}

}
}
