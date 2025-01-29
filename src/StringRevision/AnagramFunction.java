package StringRevision;

import java.util.Arrays;
import java.util.Collection;

public class AnagramFunction {
	public static void main(String[] args) {
		String input = "silent";
		String input2 = "listen";
		
		if(input.length()!=input2.length()) {
			System.out.println("not anagram");
		}else {
			char [] ch1= input.toCharArray();
			char [] ch2= input2.toCharArray();
			System.out.println(Arrays.toString(ch1));
			System.out.println(Arrays.toString(ch2));
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			System.out.println(ch1);
			System.out.println(ch2);
			boolean b1 =Arrays.equals(ch1, ch2);
			System.out.println(b1);
			if(b1==true) {
				System.out.println("Given Strings are Anagram");
			}else {
				System.out.println("Not Anagram");
			}
		}
		

	}

}
