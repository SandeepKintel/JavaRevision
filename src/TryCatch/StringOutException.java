package TryCatch;

public class StringOutException {
	public static void main(String[] args) {
		String name = "sandeep";
		
		try {
		System.out.println(name.charAt(name.length()));
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println(name.charAt(name.length()-1));
	}

}
}
