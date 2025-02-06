package StringRevision;

import java.util.ArrayList;
import java.util.List;

public class FristNonRepeatingChar {
	public static void main(String[] args) {
		
		String input = "automation";
		
		int count[] = new int[128];
		List<Character> li = new ArrayList<Character>();
		
		for(int i=0; i<input.length(); i++)
		{
			char c = input.charAt(i);
			
			if(count[c]==0)
			{
				li.add(c);
			}
		}
	}

}
