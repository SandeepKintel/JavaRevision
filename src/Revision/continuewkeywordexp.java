package Revision;

public class continuewkeywordexp {
	public static void main(String[] args) {
		int marks[] = {34, 45, 32, 56};
		
		for(int i =0; i<marks.length; i++)
		{
			System.out.println(marks[i]);
			continue marks[3];
		}
	}

}
