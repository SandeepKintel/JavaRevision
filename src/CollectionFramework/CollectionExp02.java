package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionExp02 {
	public static void main(String[] args) {
		Collection c1= new ArrayList();
		c1.add("ram");
		c1.add("namam");
		c1.add("ram");
		c1.add("naman");
		c1.add("laxma");
		c1.add(2);
		c1.add(98);
		c1.add('c');
		c1.add('d');
		c1.add(null);
		c1.add(true);
		c1.add(null);
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.add(c1);
		System.out.println(c2);
		c2.add("ramesh");
		c2.add("ram");
		c2.add(45);
		c2.add('r');
		c2.add(null);
		c2.add(false);
		System.out.println(c1 + " " + c2);
		c2.remove(c1);
		System.out.println(c2);
		c1.remove(null);
		System.out.println(c1);
		//c1.clear();
		System.out.println(c1);
		System.err.println(c1.size());
	
		
		
	}

}
