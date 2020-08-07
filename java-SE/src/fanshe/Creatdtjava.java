package fanshe;
//创建java动态文件；
import java.io.FileInputStream;
import java.util.Properties;

public class Creatdtjava {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("shuxing.properties"); //获取文件路径
		Properties p=new Properties();
		p.load(fis);
		String s=p.getProperty("class");//获取key对应的value；此时value作为类名的路径；
		Class c=Class.forName(s); //s为类名的路径；
		Object o=c.newInstance();
		System.out.println(o);
	}

}
