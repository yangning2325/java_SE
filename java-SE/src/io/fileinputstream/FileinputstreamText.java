package io.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileinputstreamText {

	public static void main(String[] args) {
		FileInputStream f=null;
		try {
			//要读取的文件地址
			f=new FileInputStream("java.txt"); 
			//定义一个byte字节数组，一次读取多个字节
			byte[] b=new byte[1024];
			//循环读取
			while(true) {
				int temp=f.read(b); //读取文件
				//System.out.println(temp);
				if (temp==-1) { //表示已经读完
					break;
				}
				System.out.print(new String(b,0,temp));
				}
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				f.close(); //释放资源
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
