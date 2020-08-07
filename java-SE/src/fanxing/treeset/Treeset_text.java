package fanxing.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset_text {

	public static void main(String[] args) {
		Set< People> s=new TreeSet<People>(new Compare());//将自己创建的比较器传进去；
		People p1=new People("175", "som");
		People p2=new People("170", "jam");
		People p3=new People("180", "tom");
		People p4=new People("165", "alan");
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);
		Iterator<People> it=s.iterator();
		while (it.hasNext()) {
			People p=it.next();
			System.out.println(p);
		}
	}

}
