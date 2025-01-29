package StringRevision;

public class StringBufferExp3 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("fortune");
		
		System.out.println(str.append(" car"));
		System.out.println(str.capacity());
		System.out.println(str.reverse());
		
		StringBuilder strb = new StringBuilder("lalbabu");
		System.out.println(str.capacity());
		System.out.println(str.delete(0, 5));
		
		
	}

}
