package StringRevision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FristNonRepeatingChar {
	public static void main(String[] args) {
		
		String input = "aautommationn";
		
		int count[] = new int[128];
		//Set<Character> li = new HashSet<Character>();
		ArrayList<Character> li = new ArrayList<Character>();
		
		for(int i=0; i<input.length(); i++)
		{
			char c = input.charAt(i);
			
			if(count[c]==0)
			{
				li.add(c);
			}
			count[c]++;
		}
		System.out.println(li + " " + li.get(0));
		
	}

}
