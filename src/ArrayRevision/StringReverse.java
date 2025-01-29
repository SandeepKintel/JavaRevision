package ArrayRevision;

import java.util.Arrays;

public class StringReverse { 
	public static void main(String[] args) {
		
		String input = "sandeep";
		String output = "";
		
		for(int i=input.length()-1; i>=0; i--) {
			char ch = input.charAt(i);
			output = output + ch;
		}
		System.out.println(output);
		char[] ch1 = output.toCharArray();
		System.out.println(Arrays.toString(ch1));
	}


}
