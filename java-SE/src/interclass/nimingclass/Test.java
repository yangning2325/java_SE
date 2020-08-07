package interclass.nimingclass;

public class Test {
	public static void t(Service s) {
		s.logout();
	}
	public static void main(String[] args) {
//		t(new Service1());
		t(new Service() {									//	new Service() {}就是一个匿名类
			public void logout() {
				System.out.println("安全退出！");
			}
		});
	}
}

interface Service {
	void logout();
}
//编写一个类实现Service接口,因为接口无实例变量无法创建对象；
//class Service1 implements Service{
//	public void logout() {
//		System.out.println("安全退出！~~~~~~");
//	}
//}
