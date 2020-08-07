package io.lock_or_password;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

public class Locktext {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf=new RandomAccessFile("java.txt","rw");
		FileLock lock=raf.getChannel().lock();//对文件上锁；
		byte[] by=new byte[1024];
		int temp;
		while ((temp=raf.read(by))!=-1) {
			System.out.print(new String(by,0,temp));
		}
		lock.release();//对文件解锁；
	}

}
