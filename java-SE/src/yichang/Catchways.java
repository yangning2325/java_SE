package yichang;

import java.io.*;

public class Catchways {

	public static void main(String[] args) {
		try {
			FileInputStream fs=new FileInputStream("D:/ava.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();			//打印输出异常结果，没有这行代码无法知道异常出在哪里；
			//也可换成以下代码
//			String ms=e.getMessage();
//			System.out.println(ms);
			//D:\ava.txt (系统找不到指定的文件。)
		}
		//出现异常该方法是捕获异常，可以运行该行代码
			System.out.println("123");
	}

}
