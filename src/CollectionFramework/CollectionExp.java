package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionExp {
	public static void main(String[] args) {
		
	Collection c1	=new ArrayList();
	c1.add("Age"); // Paremeter of .add is object 
	c1.add("Color");
	c1.add(34);
	c1.add(false);
	c1.add(null);
	c1.add(34.9);
	c1.add('D');
	System.out.println(c1);
	
	Collection c2	=new ArrayList();
	
		c2.addAll(c1);  //Parameter of .addAll is Collection
		System.out.println(c2);
		System.out.println(c2.equals(c1));
		c2.add("Sugar");
		c2.add(56);	
		c2.add(45.98);
		c2.add(true);
		c2.add(null);
		System.out.println(c2);
		System.out.println(c2.isEmpty());
		System.out.println(c2.remove("Sugar"));
		System.out.println(c2);
		System.out.println(c2.removeAll(c1));
		System.out.println(c2);
		
		Iterator i1 =c1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println(c1.size());
		System.out.println(c1.contains("Manish"));
		System.out.println(c2.containsAll(c1));
		
		Collection c3	=new ArrayList();
		
		c3.add(45);
		c3.add(20);
		c3.add(54);
		c3.add(12);
		c3.add(43);
		
		//System.out.println(Collections.sort(c3));
		
	}

}
