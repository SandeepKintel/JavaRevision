package EncapsulationExp;

class EncapsExp{
	private String username = "sandeepkr@gmail.com";
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
		
	}
	
}

public class EncapsulationRevision {

	public static void main(String[] args) {
		EncapsExp ep = new EncapsExp();
		ep.setUsername("sandeepkr112@yopmail.com");
		System.out.println(ep.getUsername());
		
	}
}
