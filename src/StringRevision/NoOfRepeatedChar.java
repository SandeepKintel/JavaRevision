package StringRevision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NoOfRepeatedChar {
	public static void main(String[] args) {
		String input = "AbdjAkddjffdekje neornfddd";
		String input2=input.replace(" ", "");
		String input3 = input2.toLowerCase();
		System.out.println(input);
		System.out.println(input2);
		System.out.println(input3);
		
		int count[] = new int[128];
		ArrayList<Character> unique_array= new ArrayList<>();
		
		
		
		
	
		for(int i=0; i<input3.length(); i++)
		{
			char c=input3.charAt(i);
			if(count[c]==0)
			{
				unique_array.add(c);
			}
			
			count[c]++;
			System.out.println(count[c]);
			
		}
		
//		Collections.sort(unique_array.reversed());
//		System.out.println(unique_array);
		Collections.sort(unique_array, Collections.reverseOrder());
		for(int i=0; i<unique_array.size(); i++)
		{
			char uniqe_char=unique_array.get(i);
			System.out.println(uniqe_char + " " + count[uniqe_char ]);
		
		}
		
		
			
	}

}
