package trainning.java.core.polymorphism.upcasting_and_downcasting.upcasting;

public class Main {
	public static void main(String[] args) {
		Parent obj1 =  new Child();
		Parent obj2 = (Parent) new Child();
//		obj1.test();
		obj1.printData();
		obj2.printData();
	}
}
