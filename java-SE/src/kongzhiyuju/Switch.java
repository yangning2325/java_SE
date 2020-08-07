package kongzhiyuju;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		while(true) {
		Scanner a=new Scanner(System.in);
		System.out.print("请输入第一个数字：");
		int x=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.print("请输入符号：");
		String s=b.next();
		char z= s.charAt(0);
		Scanner c=new Scanner(System.in);
		System.out.print("请输入第二个数字：");
		int y=c.nextInt();
		switch(z) {
		case '+':
			System.out.println(x+y);
			break;
		case '-':
			System.out.println(x-y);
			break;
		case '*':
			System.out.println(x*y);
			break;
		case '/':
			System.out.println(x/y);
			break;
		default:
			System.out.println("你的输入有误！");
			break;
		}
		}
	}

}
