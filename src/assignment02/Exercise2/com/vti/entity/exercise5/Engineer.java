package assignment02.Exercise2.com.vti.entity.exercise5;

public class Engineer extends Cadres {
	private String majors;

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public Engineer(String name, int age, String gender, String address, String majors) {
		super(name, age, gender, address);
		this.majors = majors;
	}

	@Override
	public String toString() {
		return "Engineer [majors=" + majors + ", " + super.toString() + "]";
	}

}
