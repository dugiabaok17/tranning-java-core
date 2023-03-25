package assignment02.Exercise2.com.vti.backend;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import assignment01.entity.Account;
import assignment01.entity.Department;
import assignment01.entity.Group;
import assignment01.entity.Position;

public class Exercise1 {

	public static void constructorDepartment() {
		// Constructor no parameter
		Department d1 = new Department();
		d1.setDepartmentID(1L);
		d1.setDepartmentName("du van an");

		// Constructor has 1 parameter

		Department d2 = new Department("du gia bao");

		System.out.printf("d1: " + d1 + "\nd2: " + d2);

	}

	public static void constructorAccount() {
		Account a1 = new Account();
		a1.setAccountID(2L);
		a1.setFullName("giabao");
		a1.setEmail("dugiabao@gmail.com");
		a1.setPosition(new Position(1L));
//		a1.setCreateDate();

		Account a2 = new Account(1L, "duvanan2002x@gmail.com", "an.duvan", "du van an");

		Account a3 = new Account(3l, "duvanan@gmail.com", "an", "du van an", new Department(1L, "AC Building"),
				new Position(1L, "Dev"), new Date(System.currentTimeMillis()));

		System.out.printf("\na1: " + a1 + "\na2: " + a2 + "\na3: " + a3);
	}

	public static void constructorGroup() {
//		Group g = new Group();
//		g.setGroupId(1L);
//		g.setGroupName("group badminton");
//		g.setCreateDate(new Date(System.currentTimeMillis()));
//		g.setAccount(new Account());

		Account a2 = new Account(1L, "duvanan2002x@gmail.com", "an.duvan", "du van an");

		Account a3 = new Account(3l, "duvanan@gmail.com", "an", "du van an", new Department(1L, "AC Building"),
				new Position(1L, "Dev"), new Date(System.currentTimeMillis()));
		Set<Account> a = new HashSet<>();
		a.add(a3);
		a.add(a2);
		Group g1 = new Group(2L, "Group football", a, new Date(System.currentTimeMillis()));

		Account a4 = new Account("an.duvan");

		Account a5 = new Account("giabao");

		Set<Account> a6 = new HashSet<>();
		a6.add(a4);
		a6.add(a5);

		Group g2 = new Group(2L, "Group football", a6, new Date(System.currentTimeMillis()));

		System.out.println("group account " + a6);

	}
}
