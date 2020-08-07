package xiancheng;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Jiaotidayin {

	public static void main(String[] args) throws InterruptedException {
		Take t=new Take();
		Thread t1=new Thread(t);
		t1.setName("杨宁");
		Thread t2=new Thread(t);
		t2.setName("二哈");
		
		System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
		t1.start();
		Thread.sleep(1000);
		t2.start();
	
	}

}
class Take implements Runnable{

	@Override
	public void run() {
		take();
		
	}

	private synchronized void take()  {
		if(Thread.currentThread().getName().equals("杨宁")) {
			for (int i = 0; i < 5; i++) {
				System.out.println("t1~~"+i);
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				notify();
			}
		}else if (Thread.currentThread().getName().equals("二哈")) {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("t2~~"+i);
				notify();

				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
	}
	
}
