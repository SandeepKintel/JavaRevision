package Revision;

public class StringBufferTest {
	public static void main(String[] args) 
	{
		StringBuffer input = new StringBuffer("sandeep");
		System.out.println(input.append(" kumar"));
		System.out.println(input.insert(7, "double"));
		System.out.println(input.delete(7, 13));
		
		System.out.println(input.reverse());
		
		
		
	}

}
