package trainning.java.core.demo_interface;

public class main {
	public static void main(String[] args) {
		Shape rect = new Rectangle();
		rect.draw();
		System.out.println("---");
		Shape circle = new Circle();
		circle.draw();
	}
}
