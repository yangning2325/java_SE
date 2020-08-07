package fanxing.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {
//在调用哈希表时需重写hashcode和equals方法；
	public static void main(String[] args) {
		Set s=new HashSet();  //创建一个哈希表
		People p1=new People("01", "张三");
		People p2=new People("01", "李四"); //p1和p2加在同一个单向链表上
		//People p2=new People("01", "张三"); //p1和P2重复p2将p1覆盖
		People p3=new People("04", "王玉"); //与上面加在不同数组索引；
		People p4=new People("02", "杨宁");
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);
		Iterator<People > it=s.iterator();
		//Iterator it=s.iterator();
		while (it.hasNext()) {
			People p=it.next();
			//People p=(People) it.next();
			System.out.println(p);
		}

	}

}
     //没有重写hashcod和equals方法运行结果
//People [num=04, name=王玉]
//People [num=01, name=张三]
//People [num=01, name=张三]
//People [num=02, name=杨宁]
//重写之后的结果
//People [num=01, name=张三]
//People [num=02, name=杨宁]
//People [num=04, name=王玉]
