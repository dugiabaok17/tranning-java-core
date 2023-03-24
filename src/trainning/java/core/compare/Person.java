package trainning.java.core.compare;

public class Person {
	String name;
	int id;

	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Person) {
			Person p = ((Person) obj);
			if (this.id == p.id) {
				return true;
			} else {
				return false;
			}
		} else {
			{
				return false;
			}
		}
	}
}
