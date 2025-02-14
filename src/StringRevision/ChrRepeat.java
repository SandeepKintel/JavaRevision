package StringRevision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ChrRepeat {
	public static void main(String[] args) {
		String input="testcase";
		
		int inputarray[] = new int[128];
		ArrayList<Character> s1 = new ArrayList();
		
		for(int i=0; i<input.length(); i++)
		{
			char c=input.charAt(i);
			if(inputarray[c]==0)
			{
				s1.add(c);
			}
			
			inputarray[c]++;
		}
		
		System.out.println(s1);
		
		for(int i =0; i<s1.size(); i++)
		{
			Character c2=s1.get(i);
			System.out.println(c2 + " "+ inputarray[c2]);
		}
	}

}
