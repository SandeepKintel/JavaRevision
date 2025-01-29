package ConstructorPackage;

class firstExp
{
	public firstExp()
	{
		System.out.println("First constructor");
	}
	
	public firstExp(int age)
	{
		System.out.println("first constructor "+age);
	}
}

class secondExp extends firstExp
{
	public secondExp()
	{
		super(54);
		System.out.println("Second constructor");
		String name ="sandeep";
		System.out.println(name);
		System.out.println(name.concat(" kumar"));
		System.out.println(name.replace('e', '2'));
	}
}

public class SuperCallingStatement 
{
	public static void main(String[] args) 
	{
		new secondExp();
	}
}
