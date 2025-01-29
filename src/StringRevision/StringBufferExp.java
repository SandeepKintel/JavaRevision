package StringRevision;

public class StringBufferExp {
	public static void main(String[] args) {
		StringBufferExp02 str = new StringBufferExp02();
		//System.out.println(str.reverse()); //01
		System.out.println(str.capacity()); //02
		System.out.println(str.append("stand"));
		System.out.println(str);//03
		System.out.println(str.substring(1, 3)); //04
		System.out.println(str);
		System.out.println(str.substring(8)); //05
		System.out.println(str.delete(1, 3)); //06
		System.out.println(str);
		System.out.println(str.deleteCharAt(3)); //07
		
	}

}
