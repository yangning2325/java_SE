package kongzhiyuju;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		while (true) {
			System.out.print("请输入数字:");
			int m = a.nextInt();
			if (m > 5) {
				System.out.println("OK");
			} else {
				System.out.println("No");
			}
		}
	}

}
