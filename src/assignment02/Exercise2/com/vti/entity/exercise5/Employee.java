package assignment02.Exercise2.com.vti.entity.exercise5;

public class Employee extends Cadres {
	private String work;

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Employee(String name, int age, String gender, String address, String work) {
		super(name, age, gender, address);
		this.work = work;
	}

	@Override
	public String toString() {
		return "Employee [work=" + work + ", "  + super.toString() + "]";
	}

}
