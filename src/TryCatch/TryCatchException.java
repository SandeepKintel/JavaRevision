package TryCatch;

import java.util.Arrays;
import java.util.Scanner;

public class TryCatchException {
	
	public static void main(String[] args) {
		
		int[] rollno= new int[4];
		Scanner sc=new Scanner(System.in);
		rollno[5]= sc.nextInt();
		System.out.println(rollno[5]);
		
//		try {
//			for(int i=0; i<=rollno.length; i++) {
//				rollno[i]= sc.nextInt();
//			}
//			System.out.println(Arrays.toString(rollno));
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Please enter only 4 values");
//			for(int i=0; i<=rollno.length; i++) {
//				rollno[i]= sc.nextInt();
//			}
//			System.out.println(Arrays.toString(rollno));
//		}
//	}

	
	}
}
