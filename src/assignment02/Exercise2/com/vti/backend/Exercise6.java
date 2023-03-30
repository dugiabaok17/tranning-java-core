package assignment02.Exercise2.com.vti.backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import assignment02.Exercise2.com.vti.entity.exercise5.Cadres;
import assignment02.Exercise2.com.vti.entity.exercise6.Contacts;
import assignment02.Exercise2.com.vti.entity.exercise6.News;
import assignment02.Exercise2.com.vti.entity.exercise6.Phone;
import assignment02.Exercise2.com.vti.entity.exercise6.VietnamesePhone;
import assignment02.Exercise2.com.vti.utils.ScannerUtils;

public class Exercise6 {
	private Scanner sc;
	private Phone p;
	private ArrayList<News> arrList;

	public Exercise6() {

		this.sc = new Scanner(System.in);
		this.p = new VietnamesePhone();
		this.arrList = new ArrayList<>();
		News n1 = new News("Java", LocalDate.now().toString(), "van an", "java 8");
		News n2 = new News("C#", LocalDate.now().toString(), "gia bao", ".net");
		News n3 = new News("PHP", LocalDate.now().toString(), "thu ha", "orm");
		arrList.add(n1);
		arrList.add(n2);
		arrList.add(n3);
	}

	public void cadresManage() {
		do {
			System.out.println("Program 6");
			System.out.printf("1) Thêm mới liên hệ.\r\n" + "2) Tìm kiếm theo họ tên.\r\n"
					+ "3) Hiện thị thông tin về danh sách liên hệ.\r\n" + "4) Nhập vào tên và delete liên hệ đó\r\n"
					+ "5) Update liên hệ\r\n" + "0) Thoat\r\n");
			System.out.println("Xin moi chon lua chuc nang: ");
			int enter = ScannerUtils.inputInt(sc, "Xin moi ban nhap so");
			switch (enter) {
			case 1: {
				System.out.println("Xin moi bạn nhập tên: ");
				String name = ScannerUtils.inputString(sc, "");

				System.out.println("Xin moi bạn nhập số điện thoại: ");
				String phone = ScannerUtils.inputString(sc, "");

				this.p.insertContact(name, phone);
				break;
			}

			case 2: {
				System.out.println("Xin moi bạn nhập tên cần liên hệ: ");
				String name = ScannerUtils.inputString(sc, "");
				this.p.searchContact(name);
				break;
			}

			case 3:
				this.p.findAllContact();
				break;

			case 4: {
				System.out.println("Xin moi bạn nhập tên liên hệ cần xóa: ");
				String name = ScannerUtils.inputString(sc, "");
				this.p.removeContact(name);
				break;
			}
			case 5: {
				System.out.println("Xin mời bạn nhập tên cần sửa");
				String updateName = ScannerUtils.inputString(sc, "");
				List<Contacts> listContactName = p.list.stream()
						.filter(data -> data.getName().equalsIgnoreCase(updateName)).toList();
				if (listContactName.size() > 0) {
					System.out.println("Xin moi bạn nhập tên liên hệ cần update: ");
					String name = ScannerUtils.inputString(sc, "");
					System.out.println("Xin moi bạn nhập số điện thoại: ");
					String phone = ScannerUtils.inputString(sc, "");
					p.list.set(0, new Contacts(name, phone));
					System.out.println("update thành công");
				} else {
					System.out.println("không tìm thấy");
				}

				break;
			}
			case 0: {
				System.exit(enter);
			}

			default:
				System.out.println("Xin mời bạn chọn 0 -> 5");
				break;
			}

		} while (true);

	}

	public void cadresNews() {
		do {
			System.out.println("Program 6");
			System.out.printf("1) Thêm mới bài viết.\r\n" + "2) Hiển thị danh sách bài viết.\r\n"
					+ "3) Đánh giá trung bình bài viết.\r\n" + "0) Thoat\r\n");
			System.out.println("Xin moi chon lua chuc nang: ");
			int enter = ScannerUtils.inputInt(sc, "Xin moi ban nhap so");
			switch (enter) {
			case 1: {
				System.out.println("Xin moi bạn nhập tiêu đề bải viết: ");
				String title = ScannerUtils.inputString(sc, "");

				System.out.println("Xin moi bạn nhập tác giả bài viết: ");
				String author = ScannerUtils.inputString(sc, "");

				System.out.println("Xin moi bạn nhập nội dung bài viết: ");
				String content = ScannerUtils.inputString(sc, "");
				
				System.out.println("Xin mời bạn nhập đánh giá lần thứ 1 ");
				int firstTime = ScannerUtils.inputInt(sc, "xin mời bạn nhập là số");
				System.out.println("Xin mời bạn nhập đánh giá lần thứ 2 ");
				int secondTime = ScannerUtils.inputInt(sc, "xin mời bạn nhập là số");
				System.out.println("Xin mời bạn nhập đánh giá lần thứ 3 ");
				int threeTime = ScannerUtils.inputInt(sc, "xin mời bạn nhập là số");
				int[] arr = {firstTime,secondTime,threeTime};
				
				News n = new News(title, LocalDate.now().toString(), author, content);
				
				arrList.add(n);
				n.display();
				System.out.println("averageRate: "+ n.caculate(arr));
			
				break;
			}

			case 2: {
				arrList.forEach(data -> data.display());
				break;
			}

			case 3:
			{
				
			}
			case 0: {
				System.exit(enter);
			}

			default:
				System.out.println("Xin mời bạn chọn 0 -> 5");
				break;
			}

		} while (true);

	}
}
