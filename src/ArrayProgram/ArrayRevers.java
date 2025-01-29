package ArrayProgram;

import java.util.Arrays;

public class ArrayRevers {
		public static void main(String[] args) {
			int [] rollno  = new int [3];
			rollno[0] = 23;
			rollno[1] = 34;
			rollno[2] = 26;
			
			
			int [] rollno2 = new int[3];
			
			for(int i=0, k=rollno2.length-1; i<rollno.length; i++, k--) {
				rollno2[k]= rollno[i];
			}
			System.out.println(Arrays.toString(rollno2));
			System.out.println(Arrays.toString(rollno));                  
		}
}
			
			
//			boolean b1 = Arrays.equals(rollno, rollno2);
//			System.out.println(b1);
			
//			if(b1==true) {
//				System.out.println("Arrays are equal");
//			}
		
