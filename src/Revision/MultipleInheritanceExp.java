package Revision;

class Animal
{
	public void sound()
	{
		System.out.println("animal sound");
		
	}
	
}

class cat extends Animal
{
	public void sound()
	{
		System.out.println("meow");
	}
}

class dog extends Animal
{
	public void sound()
	{
		System.out.println("bark");
	}
}

class test extends dog, cat
{
	
}
public class MultipleInheritanceExp {

}
