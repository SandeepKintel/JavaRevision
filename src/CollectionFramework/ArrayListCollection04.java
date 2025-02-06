package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListCollection04 {
	public static void main(String[] args) {
		ArrayList ar1 = new ArrayList();
		ar1.add("ram");
		ar1.add("ram");
		ar1.add('c');
		ar1.add('r');
		ar1.add(43);
		ar1.add(57);
		ar1.add(null);
		ar1.add(null);
		ArrayList ar2 = new ArrayList();
		ar2.add("ram");
		ar2.add("shyam");
		ar2.add(null);
		
		System.out.println(ar1);
		System.out.println(ar2);
		ar1.addAll(2, ar2);
		System.out.println(ar1);
		
		ListIterator l1 =ar1.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
			
		
		}
		
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
			
	}

}
