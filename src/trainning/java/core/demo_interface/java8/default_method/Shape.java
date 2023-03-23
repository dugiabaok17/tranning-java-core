package trainning.java.core.demo_interface.java8.default_method;

public class Shape implements Interface1, Interface2 {

	@Override
	public void doSomeThing() {
		Interface1.super.doSomeThing();

	}

}
