package trainning.java.core.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		 
        List<Student> listStudents = new ArrayList();
       
        listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 19, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));
      
        Collections.sort(listStudents);
      
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
	}
}
