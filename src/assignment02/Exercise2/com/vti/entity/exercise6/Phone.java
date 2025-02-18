package assignment02.Exercise2.com.vti.entity.exercise6;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
	public List<Contacts> list;

	public Phone() {
		this.list = new ArrayList<>();
		
	}

	public abstract void insertContact(String name, String phone);

	public abstract void  removeContact(String name);

	public abstract String updateContact(String name, String newPhone);

	public abstract void searchContact(String name);
	
	public abstract void findAllContact();

}
