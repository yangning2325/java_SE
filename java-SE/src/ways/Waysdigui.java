package ways;

public class Waysdigui {

	public static void main(String[] args) {
		int i = 5;
		int result = sum(i);
		System.out.println("输出结果为：" + result);
	}

	public static int sum(int i) {
		if (i == 1) {
			return 1;
		}
		return i*sum(i-1);
	}
}
