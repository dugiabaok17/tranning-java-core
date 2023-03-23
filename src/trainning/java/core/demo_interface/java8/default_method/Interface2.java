package trainning.java.core.demo_interface.java8.default_method;

public interface Interface2 {
	default void doSomeThing() {
		System.out.println("hello interface 1");
	}

	default String doSomeThing(String name) {
		return name;
	}
}
