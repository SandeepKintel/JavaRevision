package Revision;

abstract class Animaly
{
	abstract void sound();
	
	public void run()
	{
		System.out.println("running");
	}
}

class dogy extends Animaly
{
	public void sound()
	{
		System.out.println("barks");
	}	
}

public class AbstractionMethod {
	
	public static void main(String[] args) {
		dogy dg= new dogy();
		dg.sound();
		dg.run();
	}
	

}
