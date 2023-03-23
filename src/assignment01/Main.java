package assignment01;

import java.util.Date;

import assignment01.entity.Account;
import assignment01.entity.Department;
import assignment01.entity.Group;
import assignment01.entity.Position;

public class Main {
	public static void main(String[] args) {
		Account a = new Account(1l, "duvanan@gmail.com", "an", "du van an", new Department(1L, "AC Building"),
				new Position(1L, "Dev"), new Date(System.currentTimeMillis()));
		Account b = new Account(2l, "duvanan@gmail.com", "an", "du van an", new Department(1L, "AC Building"),
				new Position(1L, "Dev"), new Date(System.currentTimeMillis()));
		Account c = new Account(3l, "duvanan@gmail.com", "an", "du van an", new Department(1L, "AC Building"),
				new Position(1L, "Dev"), new Date(System.currentTimeMillis()));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		Position p = new Position(1l, "Dev");
		Position p1 = new Position(2l, "Test");
		Position p2 = new Position(3l, "BA");

		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);

		Group g = new Group(1l, "Group A", new Account(), new Date(System.currentTimeMillis()));
		Group g1 = new Group(1l, "Group A", new Account(), new Date(System.currentTimeMillis()));
		Group g2 = new Group(1l, "Group A", new Account(), new Date(System.currentTimeMillis()));
		System.out.println(g);
		System.out.println(g1);
		System.out.println(g2);
		
		
		Department d = new Department(1l, "AC Buiding");
		Department d1 = new Department(1l, "AC Buiding 1");
		Department d2 = new Department(1l, "AC Buiding 2");
	}
}
