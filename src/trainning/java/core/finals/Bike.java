package trainning.java.core.finals;

public class Bike {

	final int MAX_SPEED = 90;
	static final String PAN_CARD_NUMBER; // Biến final trống

	static {
		PAN_CARD_NUMBER = "77777";
	}
	public Bike() {
//		this.MAX_SPEED = 200;
//		PAN_CARD_NUMBER = "7777";
	}

	final void run() {
		System.out.println("running");
	}

}
