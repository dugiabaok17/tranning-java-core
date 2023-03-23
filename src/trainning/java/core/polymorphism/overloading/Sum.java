package trainning.java.core.polymorphism.overloading;

public class Sum {
	static int add(int a, int b) {
        return a + b;
    }
 
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    static double add(double a, double b) {
    	
    	return a+b;
    }
    
    static void sum(int a, long b) {
        System.out.println(a + b);
    }
   
}
