package interclass.jubuclass;

//等同于局部变量
//局部内部类是一个类中方法中的类

public class Outclass {
	int m=20;
	static int n=35;
		public void m1(){
			final int i=10; // 						局部内部类在访问局部变量时，局部变量必须用final修饰；
			class Innerclass{	//					不能用访问控制权限修饰
//				public static void m0() {
//				}											不能有静态声明
				public void m2() {
					System.out.println(i);
					System.out.println(m);		//可以访问方法外的所有数据；
					System.out.println(n);
				}
				
			}
			Innerclass inner=new Innerclass();
			inner.m2();
		}
		public static void main(String[] args) {
//			Innerclass inner=new Innerclass();	局部内部类在类外无效
//			inner.m2();
			Outclass oc=new Outclass();
			oc.m1();
		}
}
