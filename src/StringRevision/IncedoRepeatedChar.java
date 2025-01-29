package StringRevision;

import java.util.ArrayList;
import java.util.Collections;

public class IncedoRepeatedChar {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        String input= "hgfdcrtyyuiioopp";
        int[] charCount = new int[128];
        ArrayList<Character> uniqueCharacters= new ArrayList();
        
        
        
        for(int i=0; i<input.length(); i++)
        {
        	char c = input.charAt(i);
        	if(charCount[c]==0)
        	{
        		uniqueCharacters.add(c);
        		
        	}
        	
        	charCount[c]++;
        }
        
        Collections.sort(uniqueCharacters, Collections.reverseOrder());
        System.out.println(uniqueCharacters);
        
        for(int i =0; i<uniqueCharacters.size(); i++)
        {
        	Character uniqueChar = uniqueCharacters.get(i);
        	System.out.println(uniqueChar + ":" + charCount[uniqueChar]);
        	
        }
       
        
}
}
