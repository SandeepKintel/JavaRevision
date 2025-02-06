package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExp03 {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("ram");
		l1.add("ram");
		l1.add(null);
		l1.add(null);
		l1.add(23);
		l1.add('c');
		l1.add(54);
		l1.add('e');
		l1.add(false);
		l1.add(true);
		System.out.println(l1);
		
		List l2 = new ArrayList();
		l2.add("shyam");
		l2.add("raman");
		l2.add(3);
		l2.add(null);
		System.out.println(l2);
		
		l1.addAll(l2);
		System.out.println(l1);
		l2.remove("raman");
		System.out.println(l1);
		l1.remove("raman");
		System.out.println(l1);
		boolean one = l1.isEmpty();
		System.out.println(one);
		
		l1.addFirst("naman");
		System.out.println(l1);
		System.out.println(l1.lastIndexOf(null));
		l1.set(2, "geeta");
		System.out.println(l1);
		
		Iterator i1 = l1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
