package abstractclass;

public class Text {

	public static void main(String[] args) {
		Service impl = new ServiceImpl();
		impl.get();
		impl.show();
	}

}
