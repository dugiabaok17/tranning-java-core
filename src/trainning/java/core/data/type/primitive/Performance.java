package trainning.java.core.data.type.primitive;

import java.util.ArrayList;
import java.util.List;

public class Performance {
	 public static void main(String args[]) {
	        long time1 = 0;
	        long time2 = 0;
	        List<Integer> listValues = new ArrayList();
	        int arrValues[] = new int[1000000]; // Inserting values into List and Array
	        for (int i = 0; i < 1000000; i++) {
	            listValues.add(i);
	            arrValues[i] = i;
	        }
	        
	 
	        time1 = System.currentTimeMillis();
	        for (int i = 0; i < 1000000; i++) {
	            listValues.set(i, listValues.get(i) * 10);
	        }
	        time2 = System.currentTimeMillis();
	        System.out.println("AutoBoxing with Collection: " + (time2 - time1));
	 
	       
	        time1 = System.currentTimeMillis();
	 
	        for (int i = 0; i < 1000000; i++) {
	            arrValues[i] = arrValues[i] * 10;
	        }
	        time2 = System.currentTimeMillis();
	        System.out.println("Using an Array: " + (time2 - time1));
	    }
}
