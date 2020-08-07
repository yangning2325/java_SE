package superword;

public class Son extends Father {

	public Son(String name, int money) {
		super("小明",100000);//修改父类中的构造方法的实例变量参数值
	}
	public Son() {
		
	}
	public void play() {
		System.out.println("玩游戏~");
		super.play(); //在子类中访问父类的方法 ~~~此处的super不是引用
	}
	
}
