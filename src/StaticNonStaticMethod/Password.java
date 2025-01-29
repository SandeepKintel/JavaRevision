package StaticNonStaticMethod;

public class Password {
	 static void printPssword(int pass) {
		 System.out.println("Print Password " + pass);
	 }
	 
	 void EncyptPassword(String Name) {
		 System.out.println("Encrypt the password " + Name);
	 }
	 
	 public static void main(String[] args) {
		 System.out.println("Original");
	 }

}

class oneT extends Password{
	public static void main(String[] args) {
		System.out.println("Override Main Method");
		oneT.main(args);
	}
}
