
package AbstracPackage;



abstract class amazonone
{
	abstract void loginone();
	abstract void signupone();
	public void test()
	{
		System.out.println("Concrete Method");
	}
}

public class AbstractClassTestSec extends amazonone {

	@Override
	void loginone() {
		System.out.println("implemented Loging");
		
	}

	@Override
	void signupone() {
		System.out.println("implemented Singup");
		
	}
	
	static void childone()
	{
		System.out.println("Child Method");
	}
	
	public static void main(String[] args) {
		childone();
		AbstractClassTestSec ab = new AbstractClassTestSec();
		ab.loginone();
		ab.signupone();
		
	}
	
	

}
