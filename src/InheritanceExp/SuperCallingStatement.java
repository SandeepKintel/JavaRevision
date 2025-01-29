package InheritanceExp;

class AmazonSec{
	AmazonSec(){
		System.out.println("Login in to the Amazon");
	}
	
	AmazonSec(int age){
		System.out.println("Login in to the Amazon "+age);
	}
}

class Google extends AmazonSec{
	Google(){
		super();
		System.out.println("Login into the Google");
		
	}
}
public class SuperCallingStatement {
	public static void main(String[] args) {
		new Google();
	}
	

}
