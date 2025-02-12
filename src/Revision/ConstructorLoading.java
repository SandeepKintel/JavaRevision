package Revision;

public class ConstructorLoading {
	
	public ConstructorLoading()
	{
		this("raman");
		System.out.println("constructor one");
	}
	
	public ConstructorLoading(String name)
	{
		this("sandeep", 65);
		System.out.println("constructor one "+name);
	}
	
	public ConstructorLoading(String name, int age)
	{
		System.out.println("constructor one "+name+" "+age);
	}
	
	public static void main(String[] args) {
		new ConstructorLoading();
	}
	
	

}
