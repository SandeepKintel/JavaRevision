package Keywords;

class Amazon{
	void login() {
		int age = 10;
		System.out.println("Login with email id");
	}
}

class Google extends Amazon{
	
	void login() {
		int age =12;
		
		super.login();
		System.out.println("Login with mobile number");
		
	}
	
	void loginwithOtp() {
		System.out.println("login with OTP");
	}
}


public class SuperKeyword {
	
	public static void main(String[] args) {
		Google gg=new Google();
		gg.login();
	}
}
