package io.bytearrayinputstream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
//字节数组流，
public class Bytearraystream {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		byte[] bytes="我叫杨宁啊，this is yang ning ！".getBytes();
		bao.write(bytes);
		ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());//创建一个新分配的字节数组。
		byte[] by=new byte[bao.toByteArray().length];
		bis.read(by);
		System.out.println(new String(by));
		bao.close();
		bis.close();
	}

}
