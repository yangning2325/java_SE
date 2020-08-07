package zhuangshizhemoshi;

/*装饰者模式要求：
 * 1.装饰者含有被装饰着的引用；
 * 
 * 2.装饰着与被装饰着实现同一个类型
 * 
 * 3.装饰者的方法中调用被装饰者的方法；
 * */

public class Cat extends Animal {
	Animal animal;  //被装饰着的引用
	public Cat(Animal animal) { //传一个被装饰者对象，这里是一个多态（父类型引用指向一个子类型对象）
		this.animal=animal;
	}
	public void eat() {
		System.out.println("小猫吃饭了！");
		animal.eat(); //被装饰者被调用
	}

}
