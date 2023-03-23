package trainning.java.core.polymorphism.upcasting_and_downcasting.downcasting;

public class Main {
	public static void main(String[] args) {
		Parent p = new Child();
		p.name = "Shubham";

		// Performing Downcasting Implicitly
		// Child c = new Parent(); // it gives compile-time error

		// Performing Downcasting Explicitly
		if (p instanceof Child) {
			Child c = (Child) p;
			// or ((Child) p).age = 6

			c.age = 18;
			System.out.println(c.name);
			System.out.println(c.age);
			c.showMessage();

		}

	}
}
