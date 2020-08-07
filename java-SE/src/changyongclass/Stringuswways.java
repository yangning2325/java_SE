package changyongclass;

public class Stringuswways {

	public static void main(String[] args) {
		String s="yangning";
		char c=s.charAt(2);			//查找字符串中第n个字符；
		System.out.println(c);
			//n
		
		System.out.println("hello.txt".endsWith("txt"));  //判断是否为某个字符串结尾；
			// true
		
		System.out.println("abc".equalsIgnoreCase("ABC"));  //判断两个字符串是否相等（不考虑大小写）；
			// true
		
		byte[] b="abc".getBytes();
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");   //将string编码转换为字节编码输出
			//97 98 99
		}
		
		System.out.println();
		
		System.out.println("123456789".indexOf("34"));		//返回指定字符串在此字符串中出现的第一次索引
			// 2
		
		System.out.println("123123".lastIndexOf("3"));		//返回指定字符串在此字符串中出现的最后一次出现的索引
			// 5
		
		System.out.println("我爱中国，我爱我家".replaceAll("我", "杨宁"));//指定字符串进行替换
			// 杨宁爱中国，杨宁爱杨宁家

		//System.out.println("2020,01,05".split(",")); 不可行
		//[Ljava.lang.String;@15db9742,
		String t="2020,01,05";
		String[] time=t.split(",", 3);	//去除指定字符
		for(int i=0;i<time.length;i++)
		System.out.print(time[i]);
		//20200105
		
	System.out.println("yn.java".startsWith("yn"));  //测试此字符串是否以指定字符为前缀开始
		//true
	
	System.out.println("yangning".substring(4)); //返回一个新的字符串，他是此字符串的一个子字符串
		// ning
	
	System.out.println("yangning".substring(3, 5));//截取以第某个字符开始以第某个字符结束（不包括第结束的字符）
		// gn
	
	System.out.println("aBCde".toUpperCase()); //转化为大写
	// ABCDE
	
	System.out.println("aBCde".toLowerCase());// 转化为小写
	// abcde
	
	char[] c1="我是杨宁".toCharArray();
		for(int i=0;i<c1.length;i++) {
			System.out.print(c1[i]);			//将一个字符串转换为一个新的字符数组
		}
	}

}
