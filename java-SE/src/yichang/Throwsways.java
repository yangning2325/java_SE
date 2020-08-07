package yichang;

import java.io.*;

public class Throwsways {

	public static void main(String[] args) throws Exception {
		FileInputStream fs=new FileInputStream("D:/java.txt");
		//当出现异常时，此方法是抛出异常而并没有解决异常，JVM退出，无法执行该代码；
				System.out.println("123");
				
	}

}
