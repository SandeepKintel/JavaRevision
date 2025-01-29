package ArrayRevision;

import java.util.Arrays;

public class StringArray {
	public static void main(String[] args) {
//		String name [] = new String[3];
//		name [0] = "Aman";
//		name [2] = "Raman";
//		name [1] = "Naman";
//		for(int i=0; i<name.length; i++) {
//			System.out.println(name[i]);
//		}System.out.println(Arrays.toString(name));
		
        String input= "hgfdcrtyuiioopp";
        
        int count = 0;
        
        for(int i=0; i<input.length(); i++)
        {
            char ch = input.charAt(i);
            if(ch>0)
            {
                count++;
            }
            System.out.println(count + " " + ch);
        }
        
        char[] ch2 = input.toCharArray();
        Arrays.sort(ch2);
        
        
        System.out.println(Arrays.toString(ch2));
		
		
	}

}
