package StringRevision;

public class NumCharSpac {
	static int num_of_alpha=0;
	static int num_of_num=0;
	static int num_of_space=0;
	//static int num_of_char=0;
	
	public static void main(String[] args) {
		String input = "India total Population is 12203 and #$$@";
		for(int i =0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isAlphabetic(ch)) {
				num_of_alpha++;
				
			}else if(Character.isDigit(ch)){
				num_of_num++;
			}else if(Character.isSpace(ch)){
				num_of_space++;
			}else {
				//System.out.println("Test");
			}
		}
		System.out.println("Number of Alphabates are "+num_of_alpha);
		System.out.println("Number of Digits are "+num_of_num);
		System.out.println("Number of space are "+num_of_space);
		
//		int size = input.length();
//		int sum = num_of_alpha+num_of_num+num_of_space;
//		System.out.println(sum);
		
		System.out.println(input.length()-(num_of_alpha+num_of_num+num_of_space));
		//int countChar = input.length()-(num_of_alpha+num_of_num+num_of_space);
		//System.out.println("Number of Characters are "+ countChar);
	}

}
