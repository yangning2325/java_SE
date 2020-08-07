package io.fileinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Wenjiancaozzuo {
//文件复制粘贴
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("java.txt");//读文件
		FileOutputStream fos=new FileOutputStream("D:\\java.txt",true);//追加写入
		byte[] bytes=new byte[1024];
		int temp=0;
		//边读边写
		while ((temp=fis.read(bytes))!=-1) {
			//把byte数组的内容直接写入；
			fos.write(bytes, 0, temp);
		}
		fos.flush(); //强制写入；
		fis.close();
		fos.close();
	}

}
