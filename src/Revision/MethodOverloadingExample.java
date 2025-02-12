package Revision;



public class MethodOverloadingExample {
	
	public void first()
	{
		System.out.println("This is first method");
	}
	
	public void first(String name)
	{
		System.out.println("This is first method "+name);
	}
	
	public void first(String name, int age)
	{
		System.out.println("This is first method "+name+ " "+age);
	}
	
	public static void main(String[] args) {
		MethodOverloadingExample mp=new MethodOverloadingExample();
		mp.first();
		mp.first("sandeep");
		mp.first("raman", 45);
	}

}
