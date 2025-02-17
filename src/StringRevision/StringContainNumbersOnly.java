package StringRevision;

import java.util.ArrayList;

public class StringContainNumbersOnly {
	public static void main(String[] args) {
		String input = "123456";
		ArrayList<Integer> li = new ArrayList<Integer>();
		for(int i=0; i<input.length(); i++)
		{
			int num=input.charAt(i);
			if(Character.isDigit(num))
			{
				li.add(num);
			}
		}
		
		System.out.println(li);
		
		
	}

}
