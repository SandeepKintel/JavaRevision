package StringRevision;

import java.util.HashMap;
import java.util.Map;

public class StringQuestionDuplicate {

	public static void main(String[] args) {
		
	}
	
	public void Question(String str)
	{
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		  // Count the occurrences of each character in the string
		for(char c:str.toCharArray())
		{
			charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
		}
	
	/*public static void main(String[] args) {
        String input = "programming"; // You can change this string to test with other inputs

        findRepeatedCharacters(input);
    }

    public static void findRepeatedCharacters(String str) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character in the string
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print characters that appear more than once
        System.out.println("Repeated characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }
    }*/
}
}