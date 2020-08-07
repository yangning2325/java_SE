package finalword;

public  class Pepo {
		int id;
		public  static final String country="中国"; //fiall与static修饰的变量称为常量，无法被修改公用
		public Pepo(int id){
			
		}
		public final void eat() {
			System.out.println("中国人喜欢吃馒头！");
		}

}
