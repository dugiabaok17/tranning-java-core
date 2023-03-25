package assignment02.Exercise2.com.vti.entity.exercise6;

public class Contacts {
	private String name;
	private String phoneNumber;
	public Contacts() {
		
	}
	
	
	public Contacts(String name, String phoneNumber) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
}	
