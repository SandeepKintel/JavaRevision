package ArrayProgram;

public class GivenValuePart {
	public static void main(String[] args) {
		int[] marks = new int[4];
		marks[0]= 100;
		marks[1]= 200;
		marks[2]= 300;
		marks[3]= 400;
		
		int extra = 100;
		for(int i=0; i<marks.length; i++) {
			if(marks[i]==extra) {
				System.out.println("Given Number is a part of Array");
			}else {
				System.out.println("Not a part of array");
			}
			
		}
		
		
	}

}
