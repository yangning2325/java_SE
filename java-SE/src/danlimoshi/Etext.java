package danlimoshi;

public class Etext {

	public static void main(String[] args) {
		
		Ehan e1=Ehan.getInstance();
		Ehan e2=Ehan.getInstance();		//Static修饰的方法类名 . 的方式调用
		System.out.println(e1==e2);		//true
	}

}
