package CostructorOverLoading;

public class ThisCallingStatements {
	
	ThisCallingStatements(){
		this(2);
		System.out.println("This is ths first constructor");
	}
	
	ThisCallingStatements(int a){
		this("Aman");
		System.out.println("This is ths second constructor");
	}
	
	ThisCallingStatements(String Name){
		System.out.println("This is ths third constructor");
	}
	
	ThisCallingStatements(Float F){
		System.out.println("This is ths fourth constructor");
	}
	
	
	public static void main(String[] args) {
		new ThisCallingStatements("aman");
	}

}
