package superword;

public class Main {

	public static void main(String[] args) {
//		Son s=new Son();
		Son s=new Son(null,0);
		s.play();
//		s.setName("小王");
//		s.setMoney(5015);
		System.out.println(s.getName());
		System.out.println(s.getMoney());
	}

}
