package ArrayRevision;

import java.util.Arrays;

public class ArryFunction {
	public static void main(String[] args) {
		int rollno[] = new int[4];
		rollno[0] = 78;
		rollno[1] = 23;
		rollno[2] = 24;
		rollno[3] = 65;
		//rollno[4] = 16;
		Arrays.sort(rollno);
		
		for(int i =0; i<rollno.length; i++) {
			System.out.println(rollno[i]);
		}System.out.println(Arrays.toString(rollno));
		
	}

}
