package io.objectstream;

import java.io.*;
//反序列化对象，将对象从磁盘调出
public class Objectinputstreamtext {

	public static void main(String[] args) throws Exception  {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("F:\\序列化对象.txt"));
			System.out.println(ois.readObject());
	}

}
