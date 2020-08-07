package fanshe;

import java.io.FileInputStream;
import java.util.Properties;

public class Peizhiwenjian {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("shuxing.properties");
		Properties p=new Properties();
		p.load(fis); //将流中所有数据加载到属性对象中；
		String s1=p.getProperty("user");
		String s2=p.getProperty("password"); //通过key获取value
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
