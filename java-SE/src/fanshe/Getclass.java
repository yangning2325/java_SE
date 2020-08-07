package fanshe;

public class Getclass {
	
//获取class类的三种方式；
	
	public static void main(String[] args) throws Exception {
		Class c1=Class.forName("fanshe.Java");//绝对类名
		Class c2=Java.class;
		Class c3=new Java().getClass();
		Object o1=c1.newInstance(); //创建类的对象；
		Object o2=c1.newInstance();
		Object o3=c1.newInstance();
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		Class<Java> c=Java.class;
		System.out.println(c);
	}

}
