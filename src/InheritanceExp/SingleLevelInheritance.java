package InheritanceExp;

class Amazon{
	void showProduct() {
		System.out.println("Washing Machine");
	}
}

public class SingleLevelInheritance extends Amazon {
	void showProduct() {
		System.out.println("Play Station 5");
	}
	
	public static void main(String[] args) {
		SingleLevelInheritance sin = new SingleLevelInheritance();
		sin.showProduct();
		}
	
	
}

