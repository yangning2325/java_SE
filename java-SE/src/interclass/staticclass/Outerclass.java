package interclass.staticclass;

//静态内部类等同于静态变量
//可以访问外部类中私有数据（静态变量）

public class Outerclass {
	private static String s1="A";
	private  String s2="B";
	private static void m1() {
		System.out.println("static m1 method !");
	}
	private void m2() {
		System.out.println("m2 method !");
	}
	static class Innerclass{
		public static void m3() {
			System.out.println(s1);
			m1();
//			System.out.println(s2);    无法访问成员变量
//			m2();                               无法访问成员变量方法
		}
		public void m4() {
			System.out.println(s1);
			m1();
//			System.out.println(s2);    无法访问成员变量
//			m2();								无法访问成员变量方法
		}
	}
	public static void main(String[] args) {
		Outerclass.Innerclass.m3();//访问静态方法
		Innerclass i=new Outerclass.Innerclass();//访问实例方法
		i.m4();
	}
}
