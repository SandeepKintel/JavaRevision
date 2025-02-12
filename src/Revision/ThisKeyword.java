package Revision;

public class ThisKeyword {
	String name = "sandeep";
	 public void nameing(String name)
	 {
		 name=this.name;
		 //this.name = name;
		 System.out.println("the name is "+name);
	 }
	 
	 public static void main(String[] args) {
		ThisKeyword th = new ThisKeyword();
		th.nameing("naman");
	}

}
