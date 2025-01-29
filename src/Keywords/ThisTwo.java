package Keywords;

public class ThisTwo {
	int age =16;
	
	void showAge(int age) {
		this.age = age;
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		ThisTwo th=new ThisTwo();
		System.out.println(th.age);
		th.age = 47;
		System.out.println(th.age);
		
		th.showAge(34);
		System.out.println(th.age);
	}

}
