package io.lock_or_password;
//此法必须在命令行输入否则会出现空指针异常也很难	
import java.io.Console;

public class Passwordtext {

	public static void main(String[] args) {
		char[] password;
		boolean success=false;
		int count=0;
		Console console=System.console();
		while (true) {
			System.out.println("你一共有三次机会输入密码！");
			System.out.print("请输入密码：");
			password=console.readPassword();
			count++;
			String pw=new String(password);
			if (pw.equals("3282325asdw")) {
				success=true;
				System.out.printf("这是你第%d次输入密码密码输入正确！\n",count);
				break;
			}else {
				System.out.println("你输入的“%s”不正确，请重新输入！这是你第%d次输入！！");
			}
			if (count==4) {
				System.out.println("你输入的次数已用完");
				System.exit(0);
			}
			if (success) {
				System.out.println("欢迎你！！");
			}
		}

	}

}
