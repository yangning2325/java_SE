package changyongclass;

public class StringBufferclass {
//此法可以减少内存
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();		//容量可以改变的字符串缓冲区，可自动扩容
		String[] s= {"我","爱","中","国"};
		for(int i=0;i<s.length;i++) {
			if(i==s.length-1) {
				sb.append(s[i]);
			}else {
				sb.append(s[i]);			//append方法是将一个字符串数组合并成一个字符串时，在字符串数组之间添加指定字符
				sb.append("~~");
			}
		}
		System.out.println(sb);
	}

}
