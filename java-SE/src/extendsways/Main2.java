package extendsways;

public class Main2 {

	public static void main(String[] args) {
		Zi er=new Zi();
		er.price=20;
		er.xigua(25);			//访问子类私有的方法
		er.way2(3.5);			//访问子类重写父类的方法
		er.way(36.5);			//访问隐藏的继承父类的方法；
	}

}
