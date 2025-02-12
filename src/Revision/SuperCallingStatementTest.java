package Revision;

class firsty
{
	public firsty()
	{
		System.out.println("parent constructor");
	}
}

class sec extends firsty{
	public sec()
	{
		//super();
		System.out.println("child constructor");
	}
}

public class SuperCallingStatementTest 
{
	public static void main(String[] args) {
		sec sc = new sec();
	}
	

}
