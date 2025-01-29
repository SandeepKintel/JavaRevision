package CollectionFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PropertiesOfSet {
	public static void main(String[] args) {
		
		Set s1= new HashSet();
		s1.add("Ram");
		s1.add(null);
		s1.add("shyam");
		s1.add("Ram");
		s1.add(null);
		s1.add("Ram");
		s1.add(1);
		s1.add(3);
		s1.add(5);
		s1.add(2);
		s1.add(false);
		System.out.println(s1);
		
		Iterator i1 = s1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		Set s2= new HashSet();
		
		//Collections.sort(s2);
	}

}
