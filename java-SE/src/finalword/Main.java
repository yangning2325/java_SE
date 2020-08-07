package finalword;

public class Main {

	public static void main(String[] args) {
		final Pepo p=new Pepo(20);
		//p=new Pepo(30);           finall修饰的引用一旦指向某个对象不能指向其他对象
			p.id=30;                    // 可以重新赋值
		System.out.println("号码："+p.id+"国际:"+Pepo.country);

	}

}
