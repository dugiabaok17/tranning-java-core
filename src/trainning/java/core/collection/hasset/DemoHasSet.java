package trainning.java.core.collection.hasset;

import java.util.HashSet;
import java.util.Set;

public class DemoHasSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Item01");
		set.add("Item02");
		set.add("Item03");
		set.add("Item04");
		set.add("Item05");
		set.add("Item02");
		set.add("Item03");
		
		set.forEach(data -> System.out.println(data));
	}
}
