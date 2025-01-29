package StringBufferBuilderExp;

public class StringBufferExp {
	public static void main(String[] args) {
		StringBuffer st = new StringBuffer();
		StringBuffer st1 = new StringBuffer("Manish");
		StringBuffer st2 = new StringBuffer(500);
		st1.append(" Tiwari");
		System.out.println(st1);
		st1.insert(7, "test");
		System.out.println(st1);
		st1.replace(11, 17, "Kumar");
		System.out.println(st1);
		System.out.println(st1.capacity());
		
		st1.delete(11, 17);
		
		System.out.println(st1);
		System.out.println(st2.delete(0, 1));;
	
		
	}

}
