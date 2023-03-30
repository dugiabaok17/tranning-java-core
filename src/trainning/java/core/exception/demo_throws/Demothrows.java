package trainning.java.core.exception.demo_throws;

import java.io.IOException;

public class Demothrows {
	void method() throws IOException {
        throw new IOException("device error");
    }
 
    public static void main(String args[]) {
    	Demothrows obj = new Demothrows();
        try {
			obj.method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("normal flow...");
    }
}
