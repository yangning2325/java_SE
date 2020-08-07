package duotai;

public class Main {

	public static void main(String[] args) {
			Animal tom=new Cat();
			tom.move();
//			//tom.eat(); 报错，只能调用Animal里的方法，但对象是Cat，内容是对象里的的内容；
//			Bird b=new Bird();
//			b.move();
//			b.eat();
			Animal a1=new Cat();
//			Cat a2=(Cat)a1;				//强制类型转换，父类型转为子类型
//			a2.eat();
			Animal b1=new Bird();
//			Cat b2=(Cat)b1;				//类型转换异常,  b1指向的 是一个Bird类型无法转换成Cat类型，因为不存在继承关系；
//			b2.eat();
//			if(a1 instanceof Cat) {      // 可以用instanceof 运算符进行判断可以避免类型转换异常；
//					Cat a2=(Cat)a1;
//					a2.eat();
//			}else {
//				System.out.println("输出有错！");
//			}
//			if(b1 instanceof Cat) {
//				Cat b2=(Cat)b1;
//				b2.eat();
//		}else {
//			System.out.println("输出有错！");
//		}
	}

}
