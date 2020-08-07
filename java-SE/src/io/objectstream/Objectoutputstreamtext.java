package io.objectstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//序列化java对象到硬盘；

public class Objectoutputstreamtext {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("F:\\序列化对象.txt"));
		User u=new User();
		oos.writeObject(u);
		oos.flush();
		oos.close();
		}

}
