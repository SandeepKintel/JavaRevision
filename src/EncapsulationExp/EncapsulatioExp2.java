package EncapsulationExp;

public class EncapsulatioExp2
{
	private String username = "sandeepkr";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public static void main(String[] args) {
		EncapsulatioExp2 ep = new EncapsulatioExp2();
		ep.setUsername("sandeep kumar");
		System.out.println(ep.getUsername());
		
					
	}
	

}
