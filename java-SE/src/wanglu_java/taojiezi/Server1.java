package wanglu_java.taojiezi;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 implements Runnable {
	Socket sc;
	
	public Server1(Socket sc) {
		super();
		this.sc = sc;
	}

	public void run() {
		DataOutputStream os=null;
		
		try {
			os=new DataOutputStream(sc.getOutputStream());
			 while (true) {

			Scanner sr=new Scanner(System.in);
			String string=sr.next();
			os.writeUTF(string);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
