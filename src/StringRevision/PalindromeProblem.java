package StringRevision;

public class PalindromeProblem {

	public static void main(String[] args) {
		String input = "madam";
		String output = "";
		
		for(int i=input.length()-1; i>=0; i--) {
			char ch = input.charAt(i);
			output = output + ch;
		}
		System.out.println(output);
		
		boolean b1= input.equals(output);
		System.out.println(b1);
		if(b1==true) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is not a Palindrome");
		}
	}
}
