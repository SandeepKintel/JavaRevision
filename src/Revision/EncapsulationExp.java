package Revision;

class EncapsulationExample
{
	private String userid;
	private int pass;
	
	public String getuserid()
	{
		return userid;
	}
	
	public void setuserid(String userid)
	{
		this.userid=userid;
	}
	
	public int getpass()
	{
		return pass;
	}
	
	public void setpass(int pass)
	{
		this.pass=pass;
	}
}


public class EncapsulationExp 
{
	public static void main(String[] args)
	{
		EncapsulationExample ee=new EncapsulationExample();
		ee.setuserid("sandeepg181@gmail.com");
		ee.setpass(123);
		
		System.out.println(ee.getuserid()+ " " + ee.getpass());

	}

}
