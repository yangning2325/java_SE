package io.buffredreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Bufferedreader {
//public InputStreamReader(InputStream in)
	//FileInputStream继承了InputStream
	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("java.txt"); //以字节流的方式读取文件
		InputStreamReader isr=new InputStreamReader(fis); //将字节流转化成字符流
		BufferedReader br=new BufferedReader(isr);//将字符流包装成带缓冲区的字符流
		//char[] chars=new char[512];  //无需定义字符数组；
			String temp;
			while ((temp=br.readLine())!=null) {
				System.out.println(temp);
			}
			br.close();
	}

}
