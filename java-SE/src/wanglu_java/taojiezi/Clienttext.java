package wanglu_java.taojiezi;

import java.net.Socket;

public class Clienttext {

	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1", 8888);
		Thread t1=new Thread(new Client1(s));
		Thread t2 =new Thread(new Server1(s));
		t1.start();
		t2.start();

	}

}
