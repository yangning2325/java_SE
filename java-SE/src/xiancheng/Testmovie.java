package xiancheng;

import java.util.Timer;

public class Testmovie {

	public static void main(String[] args) throws InterruptedException {
		Movie m=new Movie();
		Thread t1=new Thread(m);
		t1.setName("杨宁");
		Thread t2=new Thread(m);
		t2.setName("二哈");
		t1.start();
		Thread.sleep(2000);
		t2.start();
		
	
		
		
	}

}
