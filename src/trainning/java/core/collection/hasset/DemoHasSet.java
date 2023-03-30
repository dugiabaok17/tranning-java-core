package trainning.java.core.collection.hasset;

import java.util.HashSet;
import java.util.Set;

import trainning.java.core.statics.Student;

public class DemoHasSet {
	public static void main(String[] args) {
		// Tao cac doi tuong Student

		HashSet<Student> hashSet = new HashSet<Student>();
		Student student1 = new Student("Cong");
		Student student2 = new Student("Dung");
		Student student3 = new Student("Ngon");
		Student student4 = new Student("Hanh");
		Student student5 = new Student("Hanh");
		// them cac doi tuong Student vao hashSet
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		hashSet.add(student5);

		hashSet.forEach(data -> System.out.println(data));
	}
}
