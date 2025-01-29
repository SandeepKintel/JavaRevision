package Revision;

public class ExpThisCalling {
	public ExpThisCalling() 
	{
		this(45);
		System.out.println("first constructor");
	}
	
	public ExpThisCalling(int age) 
	{
		System.out.println("Second constructor "+ age);
	}
	
	public ExpThisCalling(String name, int age) 
	{
		this();
		System.out.println("third constructor "+ name + age);
	}
	
	public static void main(String[] args) 
	{
		new ExpThisCalling("rahul", 56);
		
	}

}
