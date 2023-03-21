package trainning.java.core.polymorphism.override_ke_thua_thu_bac;

public class Main {
	public static void main(String[] args) {
		 Bank b;
	        b = new SBI();
	        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
	        b = new ICICI();
	        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
	        b = new AXIS();
	        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
	
	}
}
