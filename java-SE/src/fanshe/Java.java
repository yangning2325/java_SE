package fanshe;

public class Java {
	public static int i = 20;
	protected boolean b = true;
	private double id = 2.5;
	private String name = "这是一个Java文件";

	@Override
	public String toString() {
		return name;
	}
	public static int getI() {
		return i;
	}
	public static void setI(int i) {
		Java.i = i;
	}
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	public void name(int i) {
		this.i=i;
		
	}
	public Java() {
		super();
	}

}
