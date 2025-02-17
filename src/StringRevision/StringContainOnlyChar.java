package StringRevision;

public class StringContainOnlyChar {
	public static void main(String[] args) {
		String input="sandeep";
		
		if(input==null || input.isEmpty())
		{
			boolean b1=false;
			System.out.println(b1);
		}
		for(int i=0; i<input.length(); i++)
		{
			char c = input.charAt(i);
			if(Character.isAlphabetic(c))
			{
				boolean b2=true;
				System.out.println(b2);
			}else {
				boolean b3=false;
				System.out.println(b3);
			}
		}
		
	}


}
