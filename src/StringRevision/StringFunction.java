package StringRevision;

public class StringFunction {
	public static void main(String[] args) {
		String name = " Manish Kumar Tiwari ";
		String name2= "Aman";
		String name3= "aman";
		
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf('h'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
		System.out.println(name.substring(8));
		System.out.println(name.substring(8, 13));
		boolean b1 = name.equals(name2);
		System.out.println(b1);
		System.out.println(name2.concat(" Gupta"));
		boolean b2 = name2.contains("ani");
		System.out.println(b2);
		boolean b3 = name2.equalsIgnoreCase(name3);
		System.out.println(b3);
		
		

		
	}

}
