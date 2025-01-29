package InheritanceExp;

public class ThisKeyword {
	int age =18;
	void showAge() {
		age =18;
		age = this.age;
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		ThisKeyword th= new ThisKeyword();
		th.showAge();
	}

}
