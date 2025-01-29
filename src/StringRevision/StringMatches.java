package StringRevision;

public class StringMatches {
	public static void main(String[] args) {
		String name = "sandeep";
		System.out.println(name.matches("s(.*)"));
		System.out.println(name.matches("(.*)p"));
		System.out.println(name.matches("......"));
	}

}
