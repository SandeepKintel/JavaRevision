package Revision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExp {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("Ram");
		c1.add("34");
		c1.add(false);
		c1.add('d');
		c1.add(null);
		System.out.println(c1);
		
		Collection c2 = new ArrayList();
		c2.addAll(c1);
		c2.add("rice");
		System.out.println(c2);
		c2.remove("rice");
		Iterator i1 =c2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
