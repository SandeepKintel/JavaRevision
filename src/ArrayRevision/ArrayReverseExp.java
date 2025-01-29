package ArrayRevision;

import java.util.Arrays;

public class ArrayReverseExp {
	public static void main(String[] args) {
		double[] EmpSalary = new double[3];
		EmpSalary[0] = 7634.0;
		EmpSalary[1] = 7889.0;
		EmpSalary[2] = 7498.0;
		double[] RevSalary = new double[3];
		
		for(int i=0, k=RevSalary.length-1; i<EmpSalary.length; i++, k--) {
			RevSalary[k] = EmpSalary[i];

		}System.out.println(Arrays.toString(RevSalary));

	}
	
}
