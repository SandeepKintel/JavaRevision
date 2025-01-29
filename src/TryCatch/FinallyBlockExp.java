package TryCatch;

public class FinallyBlockExp {
	public static void main(String[] args) {
		int[] rollno = new int[3];
		
		try {
			System.out.println(rollno[2]);	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Focus on Finally Block");
		}finally {
			System.out.println("Finally Block");
		}
		

	}

}
