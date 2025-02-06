package StringRevision;

import java.util.ArrayList;
import java.util.Iterator;

public class StringRevWithSpacePlaceHolder {
	public static void main(String[] args) {
		String input = "india is good country";
		ArrayList<Integer> a1 = new ArrayList();
		ArrayList<Character> a2 = new ArrayList();
		StringBuffer sb = new StringBuffer();
		
		for(int i =0; i<input.length(); i++)
		{
			if(input.charAt(i)==' ') 
			{
				a1.add(i);
			}
		}
		System.out.println(a1);
		
		for(int i=input.length()-1; i>=0; i--)
		{
			a2.add(input.charAt(i));
		}

		System.out.println(a2);
		for(int i=0; i<a2.size(); i++)
		{
			if(a2.get(i)==' ')
			{
				a2.remove(i);
			}			
		}
		System.out.println(a2);
		for(int i=0; i<a1.size(); i++)
		{
			int a = a1.get(i);
			a2.add(a, ' ');
		}
		
		System.out.println(a2);
		
		for(Character c:a2)
		{
			sb.append(c);
		}
		
		System.out.println(input);
		System.out.println(sb);

	}
	


}
