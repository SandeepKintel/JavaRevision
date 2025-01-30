package StringRevision;

import java.util.Arrays;

public class noOfRepeatChar {
	public static void main(String[] args) {
		String input = "adkdknewdeekjdeean";
		String output="";
		
		int count[] = new int[128];
		
		for(int i=0; i<input.length(); i++)
		{
			char c = input.charAt(i);

			
			if(count[c]==0)
			{
				output= output+c;
			}
			count[c]++;
			System.out.println(c + " " + count[c]);
		}
		System.out.println(output);
		char[] char_array = output.toCharArray();
		String output2=new String(char_array);
		System.out.println(output2);
		
		
		for(int i=0; i<output2.length(); i++)
		{
			char c2= output2.charAt(i);
			System.out.println(c2+" "+count[c2]);
		}
		
		
	}

}
