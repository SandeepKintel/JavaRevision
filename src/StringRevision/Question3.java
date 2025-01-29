package StringRevision;

public class Question3 {
	public static void main(String[] args) {
		String input = "automationing";
		String output="";
		int count=0;
		for(int i=0; i<input.length(); i++)
		{
			char ch = input.charAt(i);
			String a = ""+ch;
			if(output.contains(a)){
				System.out.println(a);
				count++;
				continue;
			}
			output = output+ch;
		}System.out.println(output);
		System.out.println(count );
	}

}
