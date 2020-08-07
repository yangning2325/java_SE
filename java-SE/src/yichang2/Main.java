package yichang2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while(true) {
			Scanner s=new Scanner(System.in);
			System.out.print("请输入用户名：");
			String user=s.next();
			Customer cs=new Customer();
			try {
				cs.zhuce(user);
			} catch (Yichang e) {
				System.out.println(e.getMessage());
			}
				if(user.length()>=4)	{
					break;
				}
		}

	}

}
