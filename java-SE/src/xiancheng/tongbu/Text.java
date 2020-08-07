package xiancheng.tongbu;

public class Text {

	public static void main(String[] args) throws InterruptedException {
		Mony mony=new Mony("xc", 3000);
		Thread t1=new X(mony);
		Thread t2=new X(mony);
		
		t1.start();
		//Thread.sleep(1000);
		t2.start();
	}

}
class X extends Thread{
	Mony mony;
	
	public X(Mony mony) {
		this.mony = mony;
	}

	public void run() {
		mony.use(2000);
		System.out.println("取走2000,剩余"+mony.getYe());
	}
}
