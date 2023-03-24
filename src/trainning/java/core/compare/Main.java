package trainning.java.core.compare;

public class Main {
	public static void main(String[] args) {
		Person p = new Person("duvanan", 1);
		Person p1 = new Person("duvanan", 1);
		System.out.println(p == p1);
		System.out.println(p.equals(p1));
		
		// compareTo
		
		String str1 = "A";
	    String str2 = "A";
	    String str3 = "B";
	    int result;
	    /*so sánh str1 với str2*/
	    result = str1.compareTo(str2);
	    System.out.println("Kết quả so sánh của chuỗi str1 và str2 là: " + result); 

	    result = str1.compareTo(str3);
	    System.out.println("Kết quả so sánh của chuỗi str1 và str3 là: " + result);
	    
	    result = str3.compareTo(str1);
	    System.out.println("Kết quả so sánh của chuỗi str3 và str1 là: " + result);
	   
	}
}
