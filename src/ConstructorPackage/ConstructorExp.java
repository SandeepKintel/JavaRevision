package ConstructorPackage;

public class ConstructorExp 
{

	public ConstructorExp()
	{
		this(34);
		
		System.out.println("constructor one");
	}
	
	public ConstructorExp(String name)
	{
		System.out.println("constructor two "+name);
	}
	
	public ConstructorExp(int age)
	{
		
		System.out.println("constructor three "+age);
	}
	
	public static void main(String[] args) 
	{
		new ConstructorExp();
	}
}
