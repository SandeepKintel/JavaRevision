package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSecond {
	public static void main(String[] args) {
		Map<String,Integer> mp2=new HashMap<String,Integer>();
		mp2.put("Rohit", 57);
		mp2.put("Sumit", 75);
		mp2.put("Rohan", 59);
		mp2.put("Rishu", 89);
		
		System.out.println(mp2);
		
		//Set<String> s1 = mp2.keySet();
		
		for(String s2: mp2.keySet()) {
			System.out.println(s2);
		}
		
		for(Integer i2 : mp2.values()) {
			System.out.println(i2);
		}
		
		for(Entry<String, Integer> e1 : mp2.entrySet()) {
			System.out.println(e1);
		}
		
	}

}
