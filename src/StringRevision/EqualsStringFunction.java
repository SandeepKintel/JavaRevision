package StringRevision;

public class EqualsStringFunction {
	public static void main(String[] args) 
	{
		String input = "sandeep";
		String output = "";
		
		for(int i=0; i<input.length(); i++)
		{
			char ch = input.charAt(i);
			output = output+ch;
		}
		System.out.println(input);
		System.out.println(output);
		
		if(input.equals(output))
		{
			System.out.println("Strings are equals");
		}else
		{
			System.out.println("Not Equals");
		}

	}

	

}
