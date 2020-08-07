package xiancheng.tongbu;

public class Sisuo {
//死锁
	public static void main(String[] args) throws InterruptedException {
		Suo s1 = new Suo();
		Suo s2 = new Suo();
		S1 m = new S1(s1, s2);
		S2 m2 = new S2(s1, s2);//m1和m2共同占用两个不同的对象；
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m2);
		t1.start();
		Thread.sleep(1000);
		t2.start();
	}
}

class S1 implements Runnable {
	Suo s1;
	Suo s2;

	public S1(Suo s1, Suo s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		synchronized (s1) { //占用s1并未归还；
			s1.way2();
			try {
				Thread.sleep(2000);   //此时该程序在等待class S2将s2归还，再继续执行
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (s2) {
				s2.way();
			}
		}
	}
}

class S2 implements Runnable {
	Suo s1;
	Suo s2;

	public S2(Suo s1, Suo s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		synchronized (s2) {//已占用s2未归还
			s1.way();
			synchronized (s1) { //此时该程序在等待class S2归还s1；
				s2.way2();
			}
		}
	}
}

class Suo {

	public void way() {

		System.out.println("哈哈哈");

	}

	public void way2() {

		System.out.println("啊啊啊啊");

	}
}
