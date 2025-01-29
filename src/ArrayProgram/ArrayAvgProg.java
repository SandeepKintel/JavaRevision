package ArrayProgram;

public class ArrayAvgProg {
	public static void main(String[] args) {
		int marks[] = new int[4];
		marks[0]= 100;
		marks[1]= 150;
		marks[2]= 160;
		marks[3]= 170;
		System.out.println(marks.length);
		
		double sum =0.0;
		for(int i =0; i<marks.length; i++) {
			sum  = sum+marks[1];
		}
		double avg = sum/marks.length;
		System.out.println(avg);
		
		
	}

}
