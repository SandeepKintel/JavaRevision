package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class TakeInputFromScanner {
	public static void main(String[] args) {
		String [] name = new String[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<name.length; i++) {
			name[i] = sc.next();
		}
		System.out.println(Arrays.toString(name));
	}

}
