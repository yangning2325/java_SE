package io.randomaccessfile;

import java.io.RandomAccessFile;

public class RandomaccessfileText {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf=new RandomAccessFile("D:\\ynjava.txt", "rw");
//		String string="我就哦啊 啊啊！";
	//byte[] by=string.getBytes();
		byte[] by=new byte[1024];
		int temp;
		while ((temp=raf.read(by))!=-1) {
			System.out.print(new String(by,0,temp));
		}
//		raf.write(by);
		//raf.read(by);
		
	}

}
