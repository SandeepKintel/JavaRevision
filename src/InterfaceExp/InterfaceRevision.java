package InterfaceExp;

interface Amazon{
	void Login();
	void Signup();
}

class Google implements Amazon{
	
	@Override
	public void Login() {
		System.out.println("Login successful");
		
	}

	@Override
	public void Signup() {
		System.out.println("SignUp successful");
		
	}
	
	void ShowProduct() {
		System.out.println("Product is added");
	}
	
}

public class InterfaceRevision{
	public static void main(String[] args) {
		Google gg=new Google();
		gg.Signup();
		gg.Login();
		gg.ShowProduct();
	}
	
}

