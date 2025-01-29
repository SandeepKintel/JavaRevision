package StringRevision;

public class Palindrome {
	
	public static void main(String[] args) {
		String name ="madam";
		String name2 = "";
		
		for(int i= name.length()-1; i>=0; i--)
		{
			char ch = name.charAt(i);
			name2 = name2+ch;
			
		}
		
		System.out.println(name2);
		
		
	}

}
