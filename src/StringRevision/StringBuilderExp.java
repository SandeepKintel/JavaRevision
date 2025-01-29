package StringRevision;

public class StringBuilderExp {

	public static void main(String[] args) {
		
		// 1. sb.append(String s)
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(sb.append(" World"));
		
		// 2. sb.insert(int offset, String s)
		StringBuilder sb1 = new StringBuilder("HelloWorld");
		System.out.println(sb1.insert(5, " "));
		
		//3. sb.delete(int start index, int end index)
		StringBuilder sb2 = new StringBuilder("Hello    Sandeep");
		System.out.println(sb2.delete(5, 8));
		
		// 4. sb.replace(int start index, int end index, String s)
		StringBuilder sb3 = new StringBuilder("Hello World");
		System.out.println(sb3.replace(6, 11, "Sandeep"));
		
		// 5. sb.reverse();
		StringBuilder sb4 = new StringBuilder("Sandeep");
		System.out.println(sb4.reverse());
		
		// 6. sb.length()
		StringBuilder sb5 = new StringBuilder("Sandeep");
		System.out.println(sb5.length());
	}
}

