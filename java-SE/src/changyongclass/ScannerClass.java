package changyongclass;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		//中间必须有空格才能输出
		String n="电视花了 100 元，电脑花了 200 元，手机花了 300 元"; 
		Scanner s=new Scanner(n); //将空白作为分割标记
		int sum=0;
		while(s.hasNext()) { 		//当遍历到最后一个单词时返回false；
			try {
				int price=s.nextInt();	//提取其中的数字字符；
				sum=sum+price;
				System.out.println(price);
			} catch (Exception e) {
				String t=s.next();	//处理异常返回非数字化字符；
			}
			
		}
		System.out.println("一共花了"+sum+"元");
	}

}
