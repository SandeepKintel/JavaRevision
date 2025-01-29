package StringRevision;

public class IncedoStringRev {
	public static void main(String[] args) {
	   
	        String input="The Sky is Blue";
	        String one = input.substring(0, 3);
	        String two = input.substring(4,7);
	        String three = input.substring(8,10);
	        String four = input.substring(11,15);
	        
	        String onerev = "";
	        String tworev = " ";
	        String threerev = " ";
	        String fourrev = " ";
	        
	        System.out.println(one +" " + two + " "+three+" "+four);
	        
	        for(int i=one.length()-1; i>=0; i--)
	        {
	            char ch1 = one.charAt(i);
	            onerev = onerev+ch1;
	        }
	        
	        for(int i=two.length()-1; i>=0; i--)
	        {
	            char ch2 = two.charAt(i);
	            tworev = tworev+ch2;
	        }
	        
	        for(int i=three.length()-1; i>=0; i--)
	        {
	            char ch3 = three.charAt(i);
	            threerev = threerev+ch3;
	        }
	        
	       for(int i=four.length()-1; i>=0; i--)
	        {
	            char ch4 = four.charAt(i);
	            fourrev = fourrev+ch4;
	        }
	        String output= onerev.concat(tworev).concat(threerev).concat(fourrev);
	        System.out.println(output);
	    
	    
	}

}
