package changyongclass.show;


import java.text.DateFormatSymbols;

import java.util.*;

public class Rili

{

   public static void main(String[] args)

   {

      // construct d as current date

	  Locale.setDefault(Locale.ENGLISH);

	   

      GregorianCalendar d = new GregorianCalendar();

      

      int month = d.get(Calendar.MONTH); //用于循环打印当前月份的月历__月份判断

      int today = d.get(Calendar.DAY_OF_MONTH); //用于给当前日期后面加"*"

      

      String weekdays[] = new DateFormatSymbols().getShortWeekdays(); //保存7个星期名

   

      for(int i=1; i<8; ++i)

    	  System.out.print(weekdays[i]+" ");	//打印月历头部，7个星期名

      System.out.println();

      

      d.set(Calendar.DAY_OF_MONTH, 1); //设置d的日期为当月1号

      int weeknameofFirstday = d.get(Calendar.DAY_OF_WEEK);//获得当月1号的星期名

      

      int cnt = 1;

      while(weekdays[cnt] != weekdays[weeknameofFirstday])  //打印日历第一行，判断当月1号从第一行的哪里开始打印

      {

    	  System.out.print("    ");

    	  ++cnt;

      }

      

      do

      {

    	  int day = d.get(Calendar.DAY_OF_MONTH);

    	  System.out.printf("%3s", day);

    	  if(day == today)

    		  System.out.print("*");

    	  else

    		  System.out.print(" ");

    	  

    	  if(weekdays[d.get(Calendar.DAY_OF_WEEK)] == weekdays[7]) //判断是否需要换行打印

    		  System.out.println();

    	  d.add(Calendar.DAY_OF_MONTH, 1);

      }while(d.get(Calendar.MONTH) == month);

   }

}


