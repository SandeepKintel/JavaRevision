package Viva;

import java.util.Scanner;

public class VivaTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		
		int age =sc.nextInt();
		if(age<=60) {
			System.out.println("Person is not a senior citizen");
		}else {
			System.out.println("Person is a senior citizen");
			
		}
	}

}
