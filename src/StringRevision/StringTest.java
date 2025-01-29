package StringRevision;

public class StringTest {

	public static void main(String[] args) {
		String name = "sssaaanandeep";
		int count = 0;
		char []ch = name.toCharArray();
		for(int i =0, j=i+1; i<ch.length; i++, j++)
		{

				if(ch[i]==ch[j]) 
				{
					count++;	
				}
				System.out.println("repeated characters are "+ch[j] +" and Number of repeatations are "+count);
		}
		
	}
}
