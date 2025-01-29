package StringRevision;

import java.util.Arrays;

public class StringReplceReplaceAll {
	public static void main(String[] args) {
		String name= "Manish Kumar Tiwari 123";
		System.out.println(name.replace('M', 'Z'));
		System.out.println(name.replaceAll("[A-Z]", ""));
		System.out.println(name.replaceAll("[0-9]", ""));
		System.out.println(name.replaceAll("[a-z]", ""));
		System.out.println(name.contains("Tiwari"));
		String[] namesplit = name.split(" ", 2);
		System.out.println(Arrays.toString(namesplit));
		System.out.println(name.repeat(4));
		System.out.println(name.isEmpty());
		System.out.println(name.endsWith("3"));
		
	}

}
