package assignment02.Exercise2.com.vti.entity.exercise4;

public class Student {
	private Long id = 0l;
	private String name;
	private String hometown;
	private float point;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String hometown, float point) {
		id++;
		this.name = name;
		this.hometown = hometown;
		this.point = point;

	}

	public void setPoint(float point) {

		this.point = point;

	}

	public void display() {
		if (this.point >= 8 && this.point <= 10) {
			System.out.println("Student Infomation with id: " + id + " Name: " + name + " Học lực giỏi ");
		} else if (this.point < 8 && this.point >= 6) {
			System.out.println("Student Infomation with id: " + id + " Name: " + name + " Học lực khá");
		} else if (this.point < 6 && this.point >= 4) {
			System.out.println("Student Infomation with id: " + id + " Name: " + name + " Học lực trung bình");
		} else if (this.point >= 0 && this.point < 4) {
			System.out.println("Student Infomation with id: " + id + " Name: " + name + " Học lực yếu");
		} else {
			System.out.println("điểm không hợp lệ,0 <= điểm <= 10");
		}

	}

	public void plusPoints(float plusPoint) {
		this.point += plusPoint;
	}

}
