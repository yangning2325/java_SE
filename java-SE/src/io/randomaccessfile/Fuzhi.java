package io.randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Fuzhi {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("java.txt","rw");
		byte[] by=new byte[(int) raf.length()];
//		int temp=0;
//		while ((temp=raf.read(by))!=-1) {
//			System.out.println(new String(by,0,temp));
//			RandomAccessFile raf1=new RandomAccessFile("D:\\java.txt","rw");
//			raf1.write(by, 0, temp);
//		}
//			System.out.println(new String(by,0,raf.read(by)));
		RandomAccessFile raf1=new RandomAccessFile("D:\\java1.txt","rws");
		//raf1.seek(raf.length());
		raf1.write(by, 0, raf.read(by));
		raf.close();
		raf1.close();
	}
	

}
