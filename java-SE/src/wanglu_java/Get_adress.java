package wanglu_java;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Get_adress {

	public static void main(String[] args) throws Exception {
		InetAddress a1=InetAddress.getByName("www.baidu.com");
		InetAddress a2=InetAddress.getLocalHost();
		System.out.println(a1.getHostAddress());//获取ip地址
		System.out.println(a1.getHostName());//获取域名
		System.out.println(a2.getHostAddress());//获取本地ip地址
		System.out.println(a2.getHostName());//获取本地域名
	}

}
