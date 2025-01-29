package AccessSpecifierExp;

public class SpecifierWithinClass {
	
	public static void showPublic() {
		System.out.println("Public method");
	}
	
	protected static void showProtected() {
		System.out.println("Protected method");
	}
	
	 static void showDefault() {
		System.out.println("Default method");
	}
	
	private static void showPrivate() {
		System.out.println("Private method");
	}
	
	public static void main(String[] args) {
		
		showPublic();
		showProtected();
		showDefault();
		showProtected();
		
	}

}
