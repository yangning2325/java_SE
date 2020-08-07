package yichang;

public class Finall {

	public static void main(String[] args) {
		int j=m1();
		System.out.println("j的值："+j);
	}

	public static int m1() {
		int i=10;
		try {
	//原理：int temp=i;
	//			return temp
			return i;			//返回方法m1的值
		} finally {				//finall语句一定会执行，除非在执行try{ System.exit(0)  }（退出JVM）；
			i++;
			System.out.println("i的值："+i);
		}
	}

}
