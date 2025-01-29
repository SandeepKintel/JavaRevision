package ArrayProgram;

import java.util.Scanner;

public class ArrayAvg {
	public static void main(String[] args) {
		int marks[] = new int[4];
		double sum = 0;
		
//		marks[0]= 58; 
//		marks[1]= 75;
//		marks[2]= 85;
//		marks[3]= 68;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<marks.length; i++) {
			marks[i] = sc.nextInt();
			sum = sum+marks[i];
		}
		
		double avg = sum/4;
		System.out.println(sum/4);
		System.out.println(avg);
	}
	

}
