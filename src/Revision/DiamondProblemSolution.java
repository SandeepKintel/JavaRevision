package Revision;

interface dog
{
	public void sound();
}

interface cat
{
	public void sound();
}

class animal implements dog, cat
{

	@Override
	public void sound() {
		System.out.println("bark");
		
	}
	
}

public class DiamondProblemSolution {
	public static void main(String[] args) {
		animal an=new animal();
		an.sound();
	}


}
