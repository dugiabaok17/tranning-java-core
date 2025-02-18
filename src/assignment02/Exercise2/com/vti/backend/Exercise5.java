package assignment02.Exercise2.com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import assignment02.Exercise2.com.vti.entity.exercise5.Cadres;
import assignment02.Exercise2.com.vti.entity.exercise5.Employee;
import assignment02.Exercise2.com.vti.entity.exercise5.Engineer;
import assignment02.Exercise2.com.vti.entity.exercise5.Worker;
import assignment02.Exercise2.com.vti.utils.ScannerUtils;

public class Exercise5 {
	private List<Cadres> list;
	private Scanner sc;

	public Exercise5() {
		this.list = new ArrayList<>();
		this.sc = new Scanner(System.in);
		Cadres c = new Cadres("dư văn an", 21, "nam", "Hà nội");
		Cadres c1 = new Cadres("dư gia bảo", 20, "nam", "Hà nội");
		Cadres c2 = new Cadres("đặng quan minh", 30, "nam", "Hà nội");
		list.add(c);
		list.add(c2);
		list.add(c1);
	}

	public void cadresManage() {
		do {
			System.out.println("Program 5");
			System.out.printf("1) Thêm mới cán bộ.\r\n" + "2) Tìm kiếm theo họ tên.\r\n"
					+ "3) Hiện thị thông tin về danh sách các cán bộ.\r\n"
					+ "4) Nhập vào tên của cán bộ và delete cán bộ đó\r\n" + "0) Thoat\r\n");
			System.out.println("Xin moi chon lua chuc nang: ");
			int enter = ScannerUtils.inputInt(sc, "Xin moi ban nhap so");
			switch (enter) {
			case 1:
				System.out.println("Program 5");
				System.out.printf(
						"1) Thêm nhân viên.\r\n" + "2) Thêm công nhân.\r\n" + "3) Thêm kỹ sư.\r\n" + "0) Thoat\r\n");
				System.out.println("Xin moi chon lua chuc nang: ");
				int enter1 = ScannerUtils.inputInt(sc, "Xin moi ban nhap so");
				this.insertCadres(enter1);
				break;

			case 2:
				System.out.println(this.findByCadresName());
				break;

			case 3:
				this.findAllCadres().forEach(System.out::println);
				break;

			case 4:
				System.out.println(this.delete());
				break;

			case 0:
				System.exit(enter);

			default:
				System.out.println("Xin mời bạn chọn 0 -> 4");
				break;
			}

		} while (true);

	}

	private String insertCadres(int option) {

		System.out.println("Xin mời bạn nhập tên cho cán bộ");
		String name = ScannerUtils.inputString(sc, "");

		System.out.println("Xin mời bạn nhập tuổi cho cán bộ");
		int age = ScannerUtils.inputInt(sc, "tuổi của bạn phải là số nguyên");

		System.out.println("Xin mời bạn nhập address cho cán bộ");
		String address = ScannerUtils.inputString(sc, "");

		System.out.println("Xin mời bạn nhập giới tính cho cán bộ");
		String gender = ScannerUtils.inputString(sc, "");

		if (option == 1) {
			System.out.println("Xin mời bạn nhập việc làm cho nhân viên");
			String work = ScannerUtils.inputString(sc, "");

			Cadres c = new Employee(name, age, gender, address, work);
			list.add(c);
		} else if (option == 2) {
			System.out.println("Xin mời bạn nhập bậc cho công nhân");
			int rank = ScannerUtils.inputInt(sc, "Xin mời bạn nhập số nguyên");

			Cadres c = new Worker(name, age, gender, address, rank);
			list.add(c);
		} else if (option == 3) {
			System.out.println("Xin mời bạn nhập chuyên ngành cho kỹ sư");
			String majob = ScannerUtils.inputString(sc, "");

			Cadres c = new Engineer(name, age, gender, address, majob);
			list.add(c);
		} 

		return "thêm thành công";

	}

	private List<Cadres> findAllCadres() {
		return list;
	}

	private String findByCadresName() {
		System.out.println("Xin mời bạn nhập tên cán bộ: ");
		String name = ScannerUtils.inputString(sc, "");
		List<Cadres> listCadresName = list.stream().filter(data -> data.getName().equalsIgnoreCase(name)).toList();
		if (listCadresName.size() > 0) {
			return "đã tìm thấy cán bộ" + listCadresName.toString();
		}
		return "Không tìm thấy cán bộ nào tên vậy";
	}

	private String delete() {
		System.out.println("Xin mời bạn nhập tên cán bộ: ");
		String name = ScannerUtils.inputString(sc, "");
		List<Cadres> listCadresName = list.stream().filter(data -> data.getName().equalsIgnoreCase(name)).toList();
		if (this.list.removeAll(listCadresName)) {
			this.findAllCadres().forEach(System.out::println);
			return "Xóa thành công";
		}
		return "Không tìm thấy cán bộ nào tên vậy";
	}
}
