package ArrayRevision;

import java.util.Arrays;

public class ArrayMatch {
	public static void main(String[] args) {
		int marks[] = new int [3];
		marks[0] = 13;
		marks[1] = 14;
		marks[2] = 17;
		
		int marks1[] = new int [3];
		marks1[0] = 13;
		marks1[1] = 14;
		marks1[2] = 17;
		
		boolean b1 = Arrays.equals(marks, marks1);
		System.out.println(b1);
		
	}

}
