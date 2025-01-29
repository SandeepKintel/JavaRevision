package StringRevision;

public class StringNewFunction {

    public static void main(String[] args) {
        String input="The Sky is Blue";
        String one = input.substring(0, 3);
        String two = input.substring(4,7);
        String three = input.substring(8,10);
        String four = input.substring(11,15);
        
        System.out.println(one +" " + two + " "+three+" "+four);
    }
}
