package StringRevision;

public class StringContainIntOnly {
	
	public static boolean containOnlyDigit()
	{
		String input="12345";
		
		if(input==null || input.isEmpty())
		{
			return false;
		}
		
		for(int i=0; i<input.length(); i++)
		{
			char c=input.charAt(i);
			if(!Character.isDigit(c))
			{
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) 
	{
	
		System.err.println(containOnlyDigit());
	}

}
