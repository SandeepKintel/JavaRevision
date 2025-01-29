package StringRevision;

public class StringBufferExp02 
{
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("sandeep");
		System.out.println(str);
		System.out.println(str.substring(3));
		System.out.println(str.append(" kumar"));
		System.out.println(str.capacity());
		System.out.println(str.substring(3));
		System.out.println(str.substring(7, 13));
		System.out.println(str.reverse());
		System.out.println(str.delete(7, 13));
	
	}

}
