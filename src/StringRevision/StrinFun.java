package StringRevision;

public class StrinFun
{
	public static void main(String[] args) {
		String name = "sandeep";
		int a =40;
		float marks = 45.5f;
		double percent = 455609.43435;
		int b = (int)45.0;
		
		
		System.out.println(name.charAt(3));
		System.out.println(name.substring(3));
		System.out.println(name.substring(3, 5));
		System.out.println(name.length());
		System.out.println(name.indexOf('n'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat(" kumar"));
		boolean b1 = name.contains("ano");
		System.out.println(b1);
		
		
		
	}

}

