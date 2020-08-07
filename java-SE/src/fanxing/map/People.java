package fanxing.map;

public class People {
	String name;
	String height;
	public People(String name, String height) {
		super();
		this.name = name;
		this.height = height;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", height=" + height + "]";
	}
}
