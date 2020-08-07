package wanglu_java;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Get_url {

	public static void main(String[] args) throws Exception {
		Look l=new Look();
		Thread t=new Thread(l);
		URL u=new URL("https://www.baidu.com");
		l.seturl(u);
		t.start();

	}

}
class Look implements Runnable{
URL url;
public void seturl(URL url) {
	this.url=url;
}
	public void run() {
		InputStream is=null;
		try {
		 is=url.openStream(); //读取url资源
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte[] b=new byte[1024];
		int temp;
		try {
			while ((temp=is.read(b))!=-1) {
				System.out.println(new String(b, 0, temp));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
