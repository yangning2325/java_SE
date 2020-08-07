package xiancheng.tongbu;

public class Mianshitext {

	public static void main(String[] args) throws InterruptedException {
		Way m=new Way();
		Cheng c=new Cheng(m);
		Thread t1=new Thread(c);
		t1.setName("t1");
		Thread t2=new Thread(c);
		t2.setName("t2");
		t1.start();
		Thread.sleep(1000);
		t2.start();
	}

}
class Cheng implements Runnable{
	Way m;
	public  Cheng(Way m) {
		this.m=m;
	}
	public void run() {
		if (Thread.currentThread().getName().equals("t1")) {
			m.m1();
		}	
		if (Thread.currentThread().getName().equals("t2")) {
			m.m2();
		}		
	}
	
}
class Way{
	public synchronized void m1() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1~~~~");
	}
	public void m2() { //没有synchronized无需等待，加上就会等
		System.out.println("m2~~~~");
	}
}
