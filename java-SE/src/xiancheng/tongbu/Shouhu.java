package xiancheng.tongbu;

public class Shouhu {

	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread(new Shou());
		t.setDaemon(true); //将t设置为守护线程；
		t.start();
		for (int i = 0; i <1; i++) {
			System.out.println("main~~"+i);
			Thread.sleep(1000);
		}
	}

}
class Shou implements Runnable{

	public void run() {
		int i=0;
		while (true) {
			i++;
			System.out.println("守护线程~~"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("守护线程~~"+i);
		}
		
	}
	
}
