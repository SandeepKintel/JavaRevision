package Revision;

public class SuperKeywordExp {
	int age=18;
	
	public void firstprog(int age)
	{
		//age = 34;
	    age= this.age;
		System.out.println("current age is "+ age);
	}
	
	public static void main(String[] args) {
		SuperKeywordExp sp= new SuperKeywordExp();
		sp.firstprog(45);
		System.out.println(sp.age);
	

}
}
