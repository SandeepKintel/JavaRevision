package InterfaceExp;

interface Amazon1{
	//void Showname();
	default void Showname() {
		System.out.println("Our Test");
	};
	void Showid();
}

interface Google1{
	default void Showname() {
		System.out.println("Our double Test");
	};
	void Showid();
}

public class MultipleIneritanceExp implements Amazon1, Google1 {

	@Override
	public void Showname() {
		
	}

	@Override
	public void Showid() {
		System.out.println("Test");
	}
	
	public static void main(String[] args) {
		MultipleIneritanceExp mp=new MultipleIneritanceExp();
		mp.Showname();
		mp.Showid();
	}

}
