package assignment02.Exercise2.com.vti.entity.exercise6;

import java.util.List;

import assignment02.Exercise2.com.vti.entity.exercise5.Cadres;
import assignment02.Exercise2.com.vti.utils.ScannerUtils;

public class VietnamesePhone extends Phone{

	@Override
	public void insertContact(String name, String phone) {
		Contacts c = new Contacts("dư văn an","0337610886");
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
	public void updateContact(String name, String newPhone) {
		List<Contacts> listContactName = list.stream().filter(data -> data.getName().equalsIgnoreCase(name)).toList();
		if (listContactName.size() > 0) {	
			System.out.println("Đã tìm thấy: "+listContactName); 
		} else {
			 System.out.println("Không tìm thấy");
		}
		
	}

	@Override
	public void searchContact(String name) {
		List<Contacts> listContactName = list.stream().filter(data -> data.getName().equalsIgnoreCase(name)).toList();
		if (listContactName.size() > 0) {	
			System.out.println("Đã tìm thấy: "+listContactName); 
		} else {
			 System.out.println("Không tìm thấy");
		}
		
	}

}
