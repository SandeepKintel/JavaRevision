package AbstracPackage;

abstract class Amazon{
	abstract void login();
	abstract void SearchProduuct();
	
}

class Customer extends Amazon{

	@Override
	void login() {
		
		System.out.println("User is successfull login");
	}

	@Override
	void SearchProduuct() {
	
	    System.out.println("Search the Prodctu");
	}
	
	void AddProduct() {
		System.out.println("Product added");
	}

	
}


public class AbstractClass {
	public static void main(String[] args) {
		Customer cr=new Customer();
		cr.login();
		cr.SearchProduuct();
		cr.AddProduct();
	}

}
