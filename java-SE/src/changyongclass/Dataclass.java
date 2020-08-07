package changyongclass;

import java.text.SimpleDateFormat;
import java.util.*;

public class Dataclass {

	public static void main(String[] args) {
		Date data=new Date();
		System.out.println(data);
		SimpleDateFormat s=new SimpleDateFormat("G-yyyy-MM-dd-E-H:m-s");//进行格式化
		String time=s.format(data); //调用format方法传进一个Data对象
		System.out.println(time);
	}

}
