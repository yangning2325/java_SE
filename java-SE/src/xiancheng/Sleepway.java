package xiancheng;

public class Sleepway {

	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread(new One1());
		t.start();
		for (int i = 0; i < 10; i++) {
			Thread.sleep(2000);
			System.out.println("main~~"+i);
		}

	}

}
class One1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			try {
				Thread.sleep(1000); //进行睡眠
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("one~~"+i);
		}
	}
}
