package StringRevision;

import java.util.Arrays;

public class StringAnagramQuestion {
	public static void main(String[] args) {
		String input="Listen";
		String output="Silent";
		String modinput=input.toLowerCase();
		String modoutput=output.toLowerCase();
		if(modinput.length()==modoutput.length())
		{
			char ch01[] = modinput.toCharArray();
			char ch02[] = modoutput.toCharArray();
			Arrays.sort(ch01);
			Arrays.sort(ch02);
			boolean b1=Arrays.equals(ch01, ch02);
			if(b1==true)
			{
				System.out.println("Given Strings are anagram "+Arrays.toString(ch01)+" "+Arrays.toString(ch02));
			}

		}else {
			System.out.println("String are not anagram");
		}
	}

}
