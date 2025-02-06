package StringRevision;

import java.util.Arrays;

public class RevStringSet {
	public static void main(String[] args) {
		String input = "I Love Java";
		
		String lower_case = input.toLowerCase();
		
		String output="";
		
		char[] chars=input.toCharArray();
		
		char[] index=new char[input.length()];
			
		for(int i =input.length()-1, k=0; i>=0; i--, k++)
		{
			if(chars[i]==' ') {
				index[i]=' ';
				
			}
			if(chars[i]!=' ') {
				index[k]=chars[i];
			}
			
		}
		System.out.println(Arrays.toString(chars));
		System.out.println(Arrays.toString(index));
		
		
		
		
	}

}
