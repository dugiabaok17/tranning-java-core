package trainning.java.core.dem_abstract;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Draw " + super.getColor() + " circle");
	}

}
