package yichang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throwsways2 {

	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
			System.out.println("a b c~~~");
	}

	private static void m1() throws Exception  {
		m2();
		System.out.println("123");
	}
	//从下到上以此抛出异常
	private static void m2() throws Exception  {
			FileInputStream fs=new FileInputStream("D:/ava.txt");
		System.out.println("异常处理！");
	}
	//该程序说明只有catch……try……方法捕获异常，程序才能继续执行；		
}
