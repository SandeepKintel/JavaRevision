package Revision;

public class ArrayRev1605 {
	public static void main(String[] args) {
		int input[] =  {34, 45, 65, 32};
		
		int sum = 0;
		
		for(int i=0; i<input.length; i++)
		{
			sum = sum +input[i];
		}
		
		float avg = sum/input.length;
		System.out.println(avg);
				
	}

}
