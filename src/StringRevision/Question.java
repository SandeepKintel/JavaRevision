package StringRevision;

public class Question {
	public static void main(String[] args) {
		
		String name = "ssannndeep";
		int repeatchar=0;
		char[] ch = name.toCharArray();
		
		for(int i =0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j])
				{
					System.out.println("duplicate character is "+ ch[j]);
					repeatchar++;
				}

			}
		}System.out.println("no repeated characters are "+repeatchar);
		
	}

}
