package trainning.java.core.statics;

public class Main {
	static {
		System.out.println("Hello chay truoc nha");
	}
	public static void main(String[] args) {
		Student.change();
		Student s1 = new Student("An");
        Student s2 = new Student("Bao");
 
        System.out.println(s1);
        System.out.println(s2);
	}
}
