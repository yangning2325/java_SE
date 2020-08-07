package changyongclass;

import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		String y=String.valueOf(calendar.get(calendar.YEAR));
		String m=String.valueOf(calendar.get(calendar.MONTH)+1);
		String d=String.valueOf(calendar.get(calendar.DAY_OF_MONTH));
		String h=String .valueOf(calendar.get(calendar.HOUR_OF_DAY));
		String f=String.valueOf(calendar.get(calendar.MINUTE));
		System.out.println("现在时间是：");
		System.out.printf("%s年%s月%s日%s点%s分\n",y,m,d,h,f);
		calendar.set(2019,1,9,10,00);
	long n=calendar.getTimeInMillis();
	calendar.set(2020, 1, 9, 15, 55);
	long n1=calendar.getTimeInMillis();
	long time=(n1-n)/(1000*60*60*24);
	System.out.println("现在与2019年2月9日相隔了"+time+"天");
	}

}
