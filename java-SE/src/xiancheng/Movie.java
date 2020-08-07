package xiancheng;

public class Movie implements Runnable {
	 int mony5=2;
	 int mony20=0;
		@Override
		public void run() {
			if (Thread.currentThread().getName().equals("杨宁")) {
				getmony(20);
			}
			if (Thread.currentThread().getName().equals("二哈")) {
				getmony(5);
			}
		}
	public synchronized void getmony(int mony) {
		if (mony==5) {
			mony5++;
			System.out.printf("你好%s先生,你付款%d元钱数正好！请拿好电影票\n",Thread.currentThread().getName(),mony);
		}else if (mony5<3) {
			System.out.printf("不好意思%s,找不开零钱请等待！\n",Thread.currentThread().getName());
			try {
				wait();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("你好%s先生请继续购票\n",Thread.currentThread().getName());
			if (mony5>=3) {
				mony20++;
				mony5=mony5-3;
				System.out.printf("你好%s先生，你付款%d找你%d，请拿好电影票！",Thread.currentThread().getName(),mony,mony-5);
				
			}
		}
		notifyAll();
	}


	
	
}
