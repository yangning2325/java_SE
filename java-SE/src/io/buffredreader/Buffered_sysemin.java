package io.buffredreader;

import java.io.*;
import java.util.Scanner;

public class Buffered_sysemin {

	public static void main(String[] args)throws Exception {
		//BufferedReader传入一个Read变量
		//InputStreamReader传入的是一个InputStream变量
		System.out.println("请输入一句话："); 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //可以读取空格
			String temp;
			while ((temp=br.readLine())!=null) {
				
				System.out.println("输出结果："+temp);
			}
//			System.out.println("请再输入一句话："); //不能有空格
//			Scanner s=new Scanner(System.in);
//			String m=s.next();
//			System.out.println("此时这句话的结果为："+m);
					
	}

}
