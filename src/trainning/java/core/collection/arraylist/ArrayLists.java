package trainning.java.core.collection.arraylist;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList();
	        // thêm các phần tử vào list
	        list.add("Java");
	        list.add("C++");
	        list.add("PHP");
	        list.add("Java");
	        // hiển thị các phần tử của list
	        System.out.println("Các phần tử có trong list là: ");
	        System.out.println(list);
	        System.out.println(list.get(0));
	        list.set(0, "change nè");
	        System.out.println(list.get(0));
	        list.remove(0);
	        System.out.println(list);
	}
}
