package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PropertiesofList {
	public static void main(String[] args) {
		List li= new ArrayList();
		li.add("Ram");
		li.add(null);
		li.add("shyam");
		li.add("Ram");
		li.add(null);
		li.add("Ram");
		li.add(1);
		li.add(3);
		li.add(5);
		li.add(2);
		li.add(false);
		System.out.println(li);
		System.out.println("Iteration using Iterator");
		Iterator i1= li.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());

		}
		
		ListIterator l1 = li.listIterator();
		
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		
		
		System.out.println("Backward Iteration");
		
		while(l1.hasPrevious()) {
			System.out.println(l1.previous());
		}
		
		
		List l2= new ArrayList();
		l2.add(34);
		l2.add(12);
		l2.add(76);
		l2.add(23);
		l2.add(20);
		
		Collections.sort(l2);
		System.out.println(l2);
	
		
		
	}

}
