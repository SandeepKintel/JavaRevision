package Revision;

class Ram{
	String name="naman";
	public void rest()
	{
		System.out.println("this is the test method");
	}
}

class shyam extends Ram{
	String name = "pawan";
	public void rest()

	{	
		System.out.println("Implementation have been changed "+super.name);
	}
	public void same()
	{
		System.out.println("This is the child class");
	}
}
public class SuperCallingMethod {
	public static void main(String[] args) {
		shyam sh = new shyam();
		sh.rest();
		sh.same();
	
	}

}
