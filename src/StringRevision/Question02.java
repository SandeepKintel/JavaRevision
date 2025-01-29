package StringRevision;

public class Question02 {
	public static void main(String[] args) {
		String input= "indian";
		String output="";
		for(int i=0; i<input.length(); i++)
		{
			String ch=""+input.charAt(i);
			//output = output+ch;
			if(output.contains(ch)) {
				continue;
			}
			output=output+ch;
		}System.out.println(output);
	}

}
