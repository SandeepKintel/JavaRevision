package TypeCasting;

class Parent1{
	static void show() {
		System.out.println("Parent Static Method 1");
	}
	
	static void show2() {
		System.out.println("Parent Static Method 2");
	}
	
	void shownow() {
		System.out.println("Parent Not Static Method 1");
	}
	
	void shownow2() {
		System.out.println("Parent Not Static Method 2");
	}
}

public class AsgUpcasting extends Parent1{
	
	static void Login() {
		System.out.println("Child Static Method 1");
	}
	
	static void Login2() {
		System.out.println("Child Static Method 2");
	}
	
	void Signup() {
		System.out.println("Child Non Static Method 1");
	}
	
	void Signup2() {
		System.out.println("Child Non Static Method 2");
	}
	
	public static void main(String[] args) {
		
		Parent1 pt=new AsgUpcasting();
		AsgUpcasting asg= (AsgUpcasting)pt;
		pt.show();
		pt.show2();
		pt.shownow();
		pt.shownow2();
		
		asg.show();
		asg.show2();
		asg.shownow();
		asg.shownow2();
		asg.Login();
		asg.Login2();
		asg.Signup();
		asg.Signup2();
		
	}
	

}
