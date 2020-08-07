package wanglu_java.taojiezi;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Severtext {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(8888);

		System.out.println("监听在端口号:8888");
		Socket s = ss.accept();
Thread t1=new Thread(new Server1(s));
		//启动发送消息线程
		t1.start();
		//启动接受消息线程
Thread t2=new Thread(new Client1(s));
		t2.start();

	}

}
