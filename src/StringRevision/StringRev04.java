package StringRevision;

public class StringRev04 {
	public static void main(String[] args) {
		String input= "QA Automation is Great";
		String break01=input.substring(0, 2);
		String break02=input.substring(3, 13);
		String break03=input.substring(14, 16);
		String break04=input.substring(17);
		
		String output=break04+" "+break03+" "+break02+" "+break01;
		System.out.println(output);
		
	}

}
