package assignment02.Exercise2.com.vti.entity.exercise6;

import java.util.List;
import java.util.Scanner;

import assignment02.Exercise2.com.vti.entity.exercise5.Cadres;
import assignment02.Exercise2.com.vti.utils.ScannerUtils;

public class VietnamesePhone extends Phone {

	public VietnamesePhone() {
		Contacts c = new Contacts("dư văn an", "0337610886");
		Contacts c1 = new Contacts("dư gia bảo", "01657859148");
		Contacts c2 = new Contacts("hoàng đức gia bảo", "0337618888");
		list.add(c);
		list.add(c1);
		list.add(c2);
	}

	@Override
	public void insertContact(String name, String phone) {
		Contacts c = new Contacts(name, phone);
		this.list.add(c);
		System.out.println("thêm thành công");
	}

	@Override
	public void removeContact(String name) {
		List<Contacts> listContactName = list.stream().filter(data -> data.getName().equalsIgnoreCase(name)).toList();
		if (this.list.removeAll(listContactName)) {
			System.out.println("Xóa thành công");
		} else {
			System.out.println("Không tìm thấy");
		}

	}

	@Override
	public String updateContact(String name, String newPhone) {

	  return list.stream().filter(data -> data.getName().equalsIgnoreCase(name)).map(item -> {
		 item.setPhoneNumber(newPhone); 
	  });
		

	}

	@Override
	public void searchContact(String name) {
		List<Contacts> listContactName = list.stream().filter(data -> data.getName().equalsIgnoreCase(name)).toList();
		if (listContactName.size() > 0) {
			System.out.println("Đã tìm thấy: " + listContactName);
		} else {
			System.out.println("Không tìm thấy");
		}

	}

	@Override
	public void findAllContact() {
		this.list.forEach(System.out::println);

	}

}
