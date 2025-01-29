package ConstructorRev;

public class ConstructorRevision {
	ConstructorRevision(){
		this("aman"); //Application of this Keyword
		System.out.println("First");
	}
	ConstructorRevision(int a){
		this();
		System.out.println("Second "+ a);
		
	}
	ConstructorRevision(String name){
		System.out.println("Third "+ name);
	}
	
	public static void main(String[] args) {
		//new ConstructorRevision();
		new ConstructorRevision(2);
		//new ConstructorRevision("Aman");
	}
	

}
