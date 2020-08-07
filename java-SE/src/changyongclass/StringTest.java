package changyongclass;

public class StringTest {
//不推荐使用String做字符串拼接操作，因为会在字符串常量池中创建大量的字符串对象
//给垃圾回收带来困难；
	public static void main(String[] args) {
		String t=" ";
		String[] a= {"you","are","dog","son"};
		for(int i=0;i<a.length;i++) {
			if(i==a.length-1) {
				t+=a[i];
			}else {
				t+=a[i]+",";
			}
		}
		System.out.print(t);
			
	}

}
