package StringRevision;

public class StringMatch {
	public static void main(String[] args) {
		String name = "sandeep";
		
		System.out.println(name.matches("s(.*)"));
		System.out.println(name.matches("......"));
		System.out.println(name.matches("(.*)p"));
	}

}
