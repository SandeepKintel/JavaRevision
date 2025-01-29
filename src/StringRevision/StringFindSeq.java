package StringRevision;

public class StringFindSeq 
{
	public static void main(String[] args) 
	{
		String input= "madam";
		String output= "";
		for(int i =input.length()-1; i>=0; i--)
		{
			char ch = input.charAt(i);
			output = output+ch;
		}
		System.out.println(input);
		System.out.println(output);
		
		if(input.equals(output))
		{
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindorme");
		}
	}

}
