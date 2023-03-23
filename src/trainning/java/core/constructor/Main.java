package trainning.java.core.constructor;

public class Main {
	public static void main(String[] args) {
		
		Student s = new Student("du van an", 20);
		System.out.println(s);
		Student st = new Student();
		st.setAge(21);
		st.setName("dư gia bao");
		System.out.println(st);
	}
}
