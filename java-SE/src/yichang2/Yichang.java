package yichang2;

public class Yichang extends Exception {
	public Yichang() {
	}
	//定义异常一般提供两个构造方法
	public Yichang(String msg) {
		super(msg);//修改父类中构造方法中的参数值
	}
}
