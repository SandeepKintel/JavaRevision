package PolymorphismExp;

class Bank{
	void RateOfInterest() {
		System.out.println("Rate of Interest of 7.5%");
	}
}

class SBI extends Bank{
	void RateOfInterest() {
		System.out.println("Rate of Interest of 8.5%");
	}
}

class ICICI extends Bank{
	void RateOfInterest() {
		System.out.println("Rate of Interest of 9.5%");
	}
}

class BOB extends Bank{
	void RateOfInterest() {
		System.out.println("Rate of Interest of 10.5%");
	}
}

public class RunTimePolymorphism {
	public static void main(String[] args) {
		Bank bb= new BOB();
		Bank bb1= new ICICI();
		Bank bb2= new SBI();
		bb.RateOfInterest();
		bb1.RateOfInterest();
		bb2.RateOfInterest();
		
	}

}
