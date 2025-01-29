package Revision;

class first
{
	int age =19;
	public void firstmethod()
	{
		
		System.out.println("firstMehthod");
	}
}

class second extends first
{
	int age =30;
	public void firstmethod()
	{
		super.firstmethod();
		
		System.out.println("SecondMehthod");
		System.out.println(super.age);
		
	}
}
public class InehritanceExp 
{

	public static void main(String[] args) 
	{
		second sc = new second();
		sc.firstmethod();
		

	}
}
