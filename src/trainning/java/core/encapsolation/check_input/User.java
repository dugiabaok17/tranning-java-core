package trainning.java.core.encapsolation.check_input;

public class User {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.trim().length() == 0) {
			System.out.println("khong duoc de trong");
		} else {
			this.name = name;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 18) {
			System.out.println("ban chua du tuoi");
		} else {
			this.age = age;
		}
		
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
