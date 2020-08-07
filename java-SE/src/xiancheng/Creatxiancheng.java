package xiancheng;

public class Creatxiancheng {

	public static void main(String[] args) {
		Thread t1=new Thread(new One()); //创建线程
		Thread t2=new Two(); //线程第二种创建方法；
		t1.setPriority(6);//设置线程优先级
		t2.setPriority(1);
		Thread t=Thread.currentThread(); //获取当前线程
		t.setName("main线程"); //修改当前线程名字；
		System.out.println(t.getName());//获取当前线程名字；
		t1.start(); //启动线程
		t2.start();
		for (int i = 0; i <10; i++) {
			System.out.println("main~~"+i);
		}
		System.out.println(t2.getPriority());//获取当前线程优先级
	}

}
class One implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println("one~~"+i);
		}
	}
}
class Two extends Thread{
	@Override
	public void run() {
		super.run();
		for (int i = 0; i <10; i++) {
			System.out.println("two~~"+i);
			}
	}
}
