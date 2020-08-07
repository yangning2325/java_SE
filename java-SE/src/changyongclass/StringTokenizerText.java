package changyongclass;

import java.util.StringTokenizer;

public class StringTokenizerText {

	public static void main(String[] args) {
	String s="you are welcome(thank you),nice to meet you too";
	//对字符串s构造一个分析器
	StringTokenizer f=new StringTokenizer(s,"() ,"); //对字符串进行切割
	int n=f.countTokens();			//对切割的变量进行计数
	while (f.hasMoreElements()) { //标记字符串中是否还有语言符；有为true，没有为false；
		String string=f.nextToken(); //逐个获取切割后的
		System.out.print(string+" ");
		
	}
	System.out.println("共有单词："+n+"个");
	}

}
