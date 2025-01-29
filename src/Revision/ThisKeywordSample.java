package Revision;

public class ThisKeywordSample 
{
	int age = 19;
	
	public void show()
	{
		age=14;
		age = this.age;
		System.out.println(age);
	}
	
	public static void main(String[] args) 
	{
		ThisKeywordSample ts = new ThisKeywordSample();
		ts.show();
				
	}



}
