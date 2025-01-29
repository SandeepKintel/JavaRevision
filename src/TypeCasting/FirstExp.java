package TypeCasting;

public class FirstExp {
	public static void main(String[] args) {
		int a=100;
		double b=a; //implicit widning
		System.out.println(b);
		
		int c=200;
		double d= (double)c;
		System.out.println(d);
	}

}
