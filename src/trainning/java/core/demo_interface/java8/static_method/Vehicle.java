package trainning.java.core.demo_interface.java8.static_method;

public interface Vehicle {
	default void print() {
		
			System.out.println("Vehicle printed");
	}

	static void isValid() {
		System.out.println("Vehicle is valid");
		
	}

	void showLog();

}
