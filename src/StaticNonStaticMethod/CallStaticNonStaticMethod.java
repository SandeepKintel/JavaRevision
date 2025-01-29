package StaticNonStaticMethod;


class First{
	static void showName() {
		System.out.println("Print Name");
	}
	
	void showRollNo() {
		System.out.println("Print Roll Number");
	}
}

public class CallStaticNonStaticMethod {
	public static void main(String[] args) {
		First.showName(); // calling a static method by only class name i.e classname.methodname
		First ft = new First();
		ft.showRollNo(); // calling a not static name by creating the object of the class with the help its reference variable
		
		Password.printPssword(12345);
		Password pd = new Password();
		pd.EncyptPassword("Aman");
		
		CallStaticNonStaticMethod.main("Sandy");
		
	}
	
	public static void main(String Name) {
		System.out.println("Overloading Main Method");
	}

}
