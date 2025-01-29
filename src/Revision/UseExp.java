package Revision;

public class UseExp {
	public static void main(String[] args) {
		int marks[] = {23, 45, 32};
		try {
		System.out.println(marks[2]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("catched the exception here");
		}finally {
			System.out.println("exception is not exist that's why execcuting this block");
		}
		
		
	}

}
