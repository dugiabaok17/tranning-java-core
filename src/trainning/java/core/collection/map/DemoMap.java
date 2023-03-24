package trainning.java.core.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMap {
	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap();
	        map.put(1, "Basic java");
	        map.put(2, "OOP");
	        map.put(3, "Collection");
	 
	        // show map using method keySet()
	        for (Integer key : map.keySet()) {
	            String value = map.get(key);
	            System.out.println(key + " = " + value);
	        }
	 
	        System.out.println("---");
	 
	        // show map using method keySet()
	        for (Entry<Integer, String> entry : map.entrySet()) {
	            Integer key = entry.getKey();
	            String value = entry.getValue();
	            System.out.println(key + " = " + value);
	        }
	}
}
