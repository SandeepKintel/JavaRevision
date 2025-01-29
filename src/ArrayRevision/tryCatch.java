package ArrayRevision;

public class tryCatch {
	public static void main(String[] args) {
		int num[] = new int[3];
		try {
			System.out.println("Element at index 3; "+ num[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
		}
	}

}
