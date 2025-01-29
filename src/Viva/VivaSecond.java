package Viva;

public class VivaSecond {
	VivaSecond(){
		this(2);
		System.out.println("First Constructor");
	}
	
	VivaSecond(int a){
		
		System.out.println("Second Constructor "+a);
	}
	
	public static void main(String[] args) {
		new VivaSecond();
		
		
	}

}
