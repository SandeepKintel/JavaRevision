package Keywords;

public class ThisKeyword {
	
	final double Pie = 3.14;
	
	double radius  = 10.2;
	
	void Area(double radius) {
		this.radius = radius;
		System.out.println(radius);
	}
	
	public static void main(String[] args) {
		ThisKeyword th= new ThisKeyword();
		th.radius = 10.8;
		//th.Area(2.3);
	
		System.out.println(th.radius);
	}
	

}
