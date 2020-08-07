package extendsways;

public class Zi extends Fu {
	int price;		//隐藏父类中的成员变量；
	public void xigua( int m) {
		price=m;
		System.out.println("西瓜的价格："+price);
	}
	public void way2(double n) {	//对父类中的方法进行重写
		price=(int)(n*10);
		System.out.println("白菜的价格为："+price);
		super.way2(5.6);	//调用父类中的方法
	}
}
