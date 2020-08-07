package io.printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Printstreamtext {
//set out（）改变输出方向
//public PrintStream(OutputStream out) ；public final static PrintStream out = null; 
//PrintStream是OutputStream的一个子类
	public static void main(String[] args) throws FileNotFoundException {
		//System.setOut(new PrintStream(new FileOutputStream("D:\\javamax.txt")));
		System.setOut(new PrintStream(System.out)); //打印到控制台
		System.out.println("哈哈哈，emmmmm"); //此时不会打印到控制台而是打印到一个指定文件
		System.out.append("啊啊啊啊啊");
	}

}
