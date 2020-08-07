package xiancheng.tongbu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Plan {

	public static void main(String[] args) throws ParseException {
		Timer t=new Timer(); //创建一个计时器
		Date d =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2020-2-21 22:37:00");//时间必须是绝对时间
		t.schedule(new Test(),d,1000*5);//分别对应任务，执行时间，执行时间间隔
//		String i=new SimpleDateFormat("HH:mm:ss").format(new Date());
//		String j = "22:35:20";
	
		t.cancel();
		
	}

}
class Test extends TimerTask{
	String i=new SimpleDateFormat("HH:mm:ss").format(new Date());
	@Override
	public void run() {

		System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
		
	}
}
