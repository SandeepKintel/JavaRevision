package Revision;

public class StringExp1601 {
	public static void main(String[] args) {
		String name="  sandeep kumar  ";
		String name2 = "  SANDEEP kumar  ";
		
		System.out.println(name);
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf('n'));
		System.out.println(name.length());
		System.out.println(name.substring(4));
		boolean b1 = name.contains("sandeep");
		if(b1==true)
		{
			System.out.println("string is correct");
		}
		System.out.println(name.trim());
		System.out.println(name.concat("double"));
		boolean b2= name.equals(name2);
		if(b2==true)
		{
			System.out.println("true hai bhai true hai");
		}else
		{
			System.out.println("true nahi hai");
		}
		
		boolean b3 = name.equalsIgnoreCase(name2);
		if(b3==true)
		{
			System.out.println("ye wala sahi hai");
		}else
		{
			System.out.println("ye bhi sahi nahi");
		}
			
		
				
		//System.out.println(name.);
	}

}
