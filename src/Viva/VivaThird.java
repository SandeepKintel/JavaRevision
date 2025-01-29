package Viva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VivaThird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int age=sc.nextInt();
			System.out.println(age);
		}catch(InputMismatchException e) {
			System.out.println("the entered value is string type which is not correct");
		}
		
		

	}

}
