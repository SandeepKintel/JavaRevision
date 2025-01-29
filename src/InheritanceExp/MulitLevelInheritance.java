package InheritanceExp;

class First{
	int a= 10;
	
	void ShowAge() {
		//int a =10;
		System.out.println("Print Age "+ a);
	}

}

class Second extends First{
	
	void ShowAge() {
		int a =15;
		
		System.out.println("Print Updated Age "+ a );
	}
}
public class MulitLevelInheritance{
	public static void main(String[] args) {
	
		Second sc=new Second();
		sc.ShowAge();
	}
	
	
}
