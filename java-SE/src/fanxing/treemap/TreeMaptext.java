package fanxing.treemap;

import java.util.*;
//

public class TreeMaptext {

	public static void main(String[] args) {
		SortedMap<People,String> s=new TreeMap(new Compare());
		People p1=new People("175", "som");
		People p2=new People("170", "jam");
		People p3=new People("180", "tom");
		People p4=new People("165", "lan");
		s.put(p1,"52");
		s.put(p2,"45");
		s.put(p3,"20");
		s.put(p4,"30");
		Set<People> k=s.keySet();
		Iterator<People> it=k.iterator();
		while (it.hasNext()) {
			People id=it.next();
			Object p=s.get(id); //通过key获取value
			System.out.println(id+"  "+p);
		}
	}

}
