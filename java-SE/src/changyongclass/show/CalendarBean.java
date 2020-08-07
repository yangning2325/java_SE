package changyongclass.show;

import java.util.Calendar;

public class CalendarBean {
	int year;
	int month;
	int day;
	public String[] getcalendar() {
		Calendar rili=Calendar.getInstance();
		rili.set(year, month-1, 1);
		int weak=rili.get(Calendar.DAY_OF_WEEK)-1;		//计算出一号的星期
		String[] a=new String[42];
		if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			day=31;
		}
		if (month==4||month==6||month==9||month==11) {
			day=30;
		}
		if (month==2) {
			if ((year%4==0&&year%100!=0)||year%400==0) {
				day=29;
			}else {
				day=28;
			}
		}
	
		for (int i = 0; i < weak; i++) {
			a[i]=" ";
		}
		for (int i = weak,n=1; i < weak+day; i++) {
			a[i]=String.valueOf(n);
			n++;
		}
		for (int i = weak+day; i < a.length; i++) {
			a[i]=" ";
			
		}
		return a;
	}
}
