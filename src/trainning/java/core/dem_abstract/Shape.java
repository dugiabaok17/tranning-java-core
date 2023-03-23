package trainning.java.core.dem_abstract;

public abstract class Shape {
	private String color = "red";

	public Shape() {

	}

	public abstract void draw();

	public String getColor() {
		return color;
	}
}
