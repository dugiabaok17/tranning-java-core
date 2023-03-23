package trainning.java.core.statics;

public class Student {
	String name;
	static String college = "Cao đẳng FPT";

	public Student(String name) {
		this.name = name;
	}
	
	static void change() {
		college = "NEU";
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "," + college+ "]";
	}
	
	
}
