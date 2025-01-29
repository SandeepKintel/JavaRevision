package Revision;

class one
{
	int age = 29;
	String name  = "one";
	public void show()
	{
		System.out.println("This is the onemethod from class one");
	}
}

class test extends one
{
	//int age=45;
	public void onemethod()
	{
		System.out.println("Overrididng");
	}
	
	public void show()
	{
		super.show();
		System.out.println("This is the onemethod overided");
	}
	
}

public class SuperKeywordExp02 {
	public static void main(String[] args) 
	{
		test tt= new test();
		tt.onemethod();
		tt.show();
		System.out.println(tt.age);
		System.out.println(tt.name);
	}
	

}
