package io.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Filetext {

	public static void main(String[] args) throws IOException {
		File f1 = new File("E:\\dashuju");
		File f2 = new File("E:\\yn.txt");
		File f3 = new File("java.txt");
		File f4 = new File("F:\\java-progect\\text02");
		File f5=new File("F:\\序列化对象.txt");
		if (!f2.exists()) { // 判断这个文件是否存在
			// f2.mkdirs(); //创建目录
			f2.createNewFile();// 不存在则创建这个文件；
		}
		System.out.println(f3.getAbsoluteFile());// 输出该文件的绝对路径
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		System.out.println(sd.format(f3.lastModified()));// 最后一次访问时间：2020-02-13-15:49:43
		System.out.println(f4.getParent()); // 获取路径的父路径；
		System.out.println(f3.length());// 获取文件的长度（字节数）
		File[] files = f1.listFiles(); // 列出该目录的子文件
		for (File f : files) {
			if (f.getAbsolutePath().endsWith("py")) { //获取以py结尾的文件；
				System.out.println(f);
			}
		}
		f5.delete(); //删除文件
	}

}
