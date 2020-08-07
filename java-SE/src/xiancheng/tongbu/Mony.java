package xiancheng.tongbu;

public class Mony {
	private String count;
	private double ye;
	public Mony(String count, double ye) {
		super();
		this.count = count;
		this.ye = ye;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public double getYe() {
		return ye;
	}
	public void setYe(double ye) {
		this.ye = ye;
	}
	//public synchronized void use(double mon) { //亦可，
	public void use(double mon) {
		try {
			synchronized (this) { //线程同步机制，防止冲突，推荐这种，比较精细，this为共享的对象；
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		this.setYe(ye-mon);
	}
}
