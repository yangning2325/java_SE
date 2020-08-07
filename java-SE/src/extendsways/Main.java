package extendsways;

public class Main {

	public static void main(String[] args) {
		Son s=new Son();
		s.setMoney(20000000);
		s.setName("杨宁");
		System.out.println(s.getName()+"继承了他父亲的财产"+s.getMoney());
	}

}
