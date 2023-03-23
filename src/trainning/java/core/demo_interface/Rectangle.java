package trainning.java.core.demo_interface;

public class Rectangle implements Shape, Color{

	@Override
	public void draw() {
		 System.out.println("Draw " + getColor() + " rectangle");
		
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Pink";
	}

}
