package yichang2;

public class Customer {
		public void zhuce(String name) throws Yichang {
			if(name.length()<4) {
				//创建异常对象
				//Yichang y=new Yichang("用户名不能少于4位！");
				//手动抛出异常
				//throw y;
				throw new Yichang("用户名不能少于4位！");
			}
			System.out.println("注册成功！");
		}
}
