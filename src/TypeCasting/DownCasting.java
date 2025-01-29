package TypeCasting;

class Parent{
	void show() {
		
	}
}

public class DownCasting extends Parent {
	public static void main(String[] args) {
		Parent pp= new DownCasting();
		DownCasting dc = (DownCasting)pp;
	}

}
