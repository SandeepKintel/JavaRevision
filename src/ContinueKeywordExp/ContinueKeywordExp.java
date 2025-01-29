package ContinueKeywordExp;

public class ContinueKeywordExp {
	public static void main(String[] args) {
		int num = 4;
		
		for(int i=0; i<=4; i++) {
			if(i==3) {
				continue;
			}
			
			System.out.println(i);
		}
	}

}
