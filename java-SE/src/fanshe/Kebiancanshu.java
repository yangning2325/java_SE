package fanshe;

import java.util.Date;

//可变长参数；
public class Kebiancanshu {

	public static void main(String[] args) {
		way(1,2,3);//数字为1-n；
		String[] s= {"猫","狗","猪",};
		way2(s); //可传数组；
		//way2("张三","李四","小明","小飞");
		Class c1=Java.class;
		Class c2=Date.class;
		Class c3=Getclass.class;
		way3(c1,c2,c3); //传入class类
	}
public static void way(int...num) {
	System.out.println("输入啥数字都可以！");
}
public static void way2(String...args) { //可作为数组进行输入
	for (int i = 0; i < args.length; i++) {
		System.out.println(args[i]);
	}
}
public static void way3(Class...classes) { //可传类；
	for (int i = 0; i < classes.length; i++) {
		System.out.println(classes[i]);
	}
}
}
