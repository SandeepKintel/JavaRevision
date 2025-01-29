package ArrayRevision;

import java.util.Arrays;

public class ArrayRev 
{
	public static void main(String[] args) 
	{
		String[] names = new String [3];
		names[0] = "sandeep";
		names[1] = "raman";
		names[2] = "rahul";
		
		String [] name2 = new String [3];
		System.out.println(Arrays.toString(names));
		
		for(int i= names.length-1, k=0; i>=0; i--, k++) 
		{
			name2[k]  = names[i];
			
		}
		System.out.println(Arrays.toString(name2));
		
		
	}

}
