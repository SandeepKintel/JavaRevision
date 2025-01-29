package CollectionFramework;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorPropeeties {
	public static void main(String[] args) {
		Vector vc=new Vector();
		vc.addElement("Ram");
		vc.addElement(null);
		vc.addElement("Ram");
		vc.addElement("Ram");
		vc.addElement(null);
		vc.addElement(1);
		vc.addElement(43);
		vc.addElement(23);
		vc.addElement("Shyam");
		vc.addElement(false);
		System.out.println(vc);
		
		Vector vc1=new Vector();
		vc1.addElement(20);
		vc1.addElement(4);
		vc1.addElement(13);
		vc1.addElement(32);
		vc1.addElement(1);
		vc1.addElement(23);
		
		Collections.sort(vc1);
		System.out.println(vc1);
		
		
	Enumeration e=	vc.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
		
	}

}
