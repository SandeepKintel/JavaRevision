package TryCatch;

import java.util.Scanner;

public class SecondProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int limit = sc.nextInt();
		int [] rollno = new int[limit];
		//System.out.println(rollno[limit+1]);
				
		try {
			System.out.println(rollno[limit+1]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter please enter the exact value");
		}
				
				
	}

}
