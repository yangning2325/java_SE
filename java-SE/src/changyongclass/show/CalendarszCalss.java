package changyongclass.show;

import java.util.*;

public class CalendarszCalss {

	public static void main(String[] args) {
		CalendarBean b=new CalendarBean(); 
		b.year=2020;
		b.month=2;
		String[] a=b.getcalendar();
		char[] str="日一二三四五六".toCharArray();
		for (int i = 0; i < str.length; i++) {
			System.out.printf("%3c",str[i]);
		}
		for (int i = 0; i < a.length; i++) {
			if (i%7==0) {
				System.out.println(" ");
			}
			System.out.printf("%4s",a[i]);
		}
	}

}
