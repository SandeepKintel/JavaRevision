package StringRevision;

import java.util.ArrayList;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String Input[] = {"automationTest", "autoDeploy", "autoRun"};
		String input1=Input[0];
		String input2=Input[1];
		String input3=Input[2];
		System.out.println(input1+input2+input3 );
		ArrayList<Character> ar = new ArrayList();
		
		for(int i=0; i<input2.length(); i++)
		{
			char c = input2.charAt(i);
			if(input1.charAt(i)==c)
			{
				ar.add(c);
			}
		}
		
		System.out.println(ar);
	
	
		
	}
	

}
