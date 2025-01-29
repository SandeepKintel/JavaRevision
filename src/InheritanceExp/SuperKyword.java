package InheritanceExp;

class Amazon1
{
	int a =10;
	
	void login() 
	{
		System.out.println("Login to Amazon");
	}
}

class Flipkart extends Amazon1
{
	int a =18;
	
	void login()
	{
		super.login();
		System.out.println("Login to Amazon "+ super.a);
	}
}


public class SuperKyword 
{
	public static void main(String[] args) 
	{
		Flipkart fp=new Flipkart();
		fp.login();
	}
	

}
