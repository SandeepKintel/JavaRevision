package ArrayRevision;

import java.util.Collection;

public class FinalVariableExp {
	final double Pie = 3.14;
	
	void area() {
		int radius = 10;
		double area = Pie*radius*radius;
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		FinalVariableExp fp=new FinalVariableExp();
		fp.area();
		
		
	}

}
