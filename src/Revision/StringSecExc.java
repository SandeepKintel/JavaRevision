package Revision;

import java.util.Arrays;

public class StringSecExc {
	public static void main(String[] args) {
		String input = "vimal";
		char[] ch = input.toCharArray();
		System.out.println(ch);
		System.out.println(Arrays.toString(ch));
		
		
		String input1 = "madam";
	    String output= "";
	    
	    
	    for(int i=0; i<input1.length(); i++)
	    {
	    	char ch1 = input1.charAt(i);
	    	output = output+ch1;
	 
	    }
	    
	    System.out.println(output);
	    
	    boolean b1 = input1.equals(output);
	    if(b1==true)
	    {
	    	System.out.println("String is palindrome");
	    }
		
	}

}
