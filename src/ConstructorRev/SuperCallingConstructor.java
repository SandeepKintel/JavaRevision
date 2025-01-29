package ConstructorRev;

class Amazon{
	Amazon(){
		System.out.println("Amazon constructor");
	}
	
	Amazon(int a ){
		System.out.println("Amazon constructor "+a);
	}
}


class Google extends Amazon{
	
	Google(){
		super(4);
		System.out.println("Google Constructor");
		
	}
}
public class SuperCallingConstructor {
	public static void main(String[] args) {
		new Google();
	}

}
