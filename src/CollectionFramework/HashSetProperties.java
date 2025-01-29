package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetProperties {
	public static void main(String[] args) {
		Set st = new HashSet();
		st.add("Ram");
		st.add("Ram");
		st.add(null);
		st.add("Shyam");
		st.add(null);
		st.add(1);
		st.add(false);
		st.add(34);
		st.add(45.9);
		st.add(true);
		st.add(null);
		System.out.println(st);
		
		
		
	}

}
