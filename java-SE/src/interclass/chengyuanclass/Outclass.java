package interclass.chengyuanclass;

//成员内部类等同看作成员变量
//可以访问外部类的所有数据

public class Outclass {
	private static String s1="A";
	private  String s2="B";
	private static void m1() {
		System.out.println("static m1 method !");
	}
	private void m2() {
		System.out.println("m2 method !");
	}
	class Innerclass{  //     成员内部类
//		public static void m3() {		成员内部类不能有静态声明；
//		}
		public void m4() {			//既可以访问静态变量 又可以访问成员变量；
			System.out.println(s1);
			m1();
			System.out.println(s2);    
			m2();								
		}
	}
	public static void main(String[] args) {
		Outclass oc=new Outclass();    //外部对象
		Innerclass i=oc.new Innerclass();//内部对象
		//Innerclass i=new Outclass.Innerclass();
		/*
		 * 不能用此法访问，因为成员内部类相当于一个成员变量 成员变量的发个文必须有对象的存在，
		 * 不能直接用<类名.>的方式访问
		 */
		i.m4();
	}
}
