package trainning.java.core.dem_abstract;

public class Main {
	public static void main(String[] args) {
		Shape rect = new Rectangle();
		rect.draw();
		System.out.println("---");
		Shape circle = new Circle();
		circle.draw();
	}
}
