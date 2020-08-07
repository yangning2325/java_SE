package fanxing.treeset;

public class People {
	String height;
	String name;
	
	public People(String height, String name) {
		super();
		this.height = height;
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [height=" + height + ", name=" + name + "]";
	}
}
