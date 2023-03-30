package assignment03.exrices2.com.vti;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student implements IStudent {

	private List<Student> list = new ArrayList<>();
	private int id;
	private String name;
	private int group;

	public Student() {
		Student s = new Student(1, "dư văn an 1", 1);
		Student s1 = new Student(2, "dư văn an 2", 1);
		Student s2 = new Student(3, "dư văn an 3", 1);
		Student s3 = new Student(4, "dư văn an 4", 2);
		Student s4 = new Student(5, "dư văn an 5", 2);
		Student s5 = new Student(6, "dư văn an 6", 2);
		Student s6 = new Student(7, "dư văn an 7", 3);
		Student s7 = new Student(8, "dư văn an 8", 3);
		Student s8 = new Student(9, "dư văn an 9", 3);
		Student s9 = new Student(10, "dư văn an 10", 3);
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		list.add(s9);
	}

	public Student(int id, String name, int group) {
		this.id = id;
		this.name = name;
		this.group = group;
	}

	@Override
	public void attendance() {
		list.stream().map(data -> "sinh viên " + data.getName() + " đã điểm danh").forEach(System.out::println);
	}

	@Override
	public void study() {
		for (Student student : list) {

			System.out.println(student.getName() + " đi học bài group " + student.getGroup());
			if (student.id > 2) {
				break;
			}
		}

	}

	@Override
	public void clean() {
		for (Student student : list) {
			
			if (student.getGroup() == 2) {
				System.out.println(student.getName() + " đi dọn vệ sinh group " + student.getGroup());
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	@Override
	public void init() {

		list.forEach(System.out::println);

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", group=" + group + "]";
	}

}
