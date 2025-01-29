package ArrayRevision;

import java.util.Arrays;

public class CountSpaceAlphaNumSpecChar {
	static int count_space=0;
	static int count_alpha=0;
	static int count_num=0;
	
	public static void main(String[] args) {
		String sentance = "My name is sandeep and my dob $@ is 11 02 1995";
		
		char[] ch = sentance.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		System.out.println("Count Total Number of Alphabets");
		for(int i=0; i<sentance.length(); i++) {
			char ch2 = sentance.charAt(i);
			boolean b1= Character.isAlphabetic(ch2);
			System.out.println(b1);
			if(b1==true) {
				count_alpha++;
			}
		}System.out.println("Total count of Alphabets are "+ count_alpha);
		
		System.out.println("Count Total Number of Numeric Values");
		for(int i=0; i<sentance.length(); i++) {
			char ch3 = sentance.charAt(i);
			boolean b2= Character.isDigit(ch3);
			System.out.println(b2);
			if(b2==true) {
				count_num++;
			}
		}System.out.println("Total count of Numerric Values are "+ count_num);
		
		System.out.println("Count Total Number of spaces");
		for(int i=0; i<sentance.length(); i++) {
			char ch3 = sentance.charAt(i);
			boolean b3= Character.isSpaceChar(ch3);
			System.out.println(b3);
			if(b3==true) {
				count_space++;
			}
		}System.out.println("Total count of spaces are "+ count_space);
		
		System.out.println("Total Number of Characters are "+sentance.length());
		
		int num_SpecialChar = sentance.length()-(count_alpha + count_num + count_space);
		System.out.println("The total count of special characters in the sentence are "+ num_SpecialChar);
	}
	


	
	

}
