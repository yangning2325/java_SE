package fanxing.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maptext {

	public static void main(String[] args) {
		Map<Peoplekey, People> m=new HashMap<>();
		m.put(new Peoplekey(01), new People("sam", "175"));
		//m.put(new Peoplekey(01), new People("sam", "175"));
		m.put(new Peoplekey(03), new People("jam", "165"));
		m.put(new Peoplekey(02), new People("jon", "170"));
		m.put(new Peoplekey(05), new People("tim", "185"));
		//m.remove(new Peoplekey(03) ); //通过key将键值对删除；
		Set<Peoplekey> k=m.keySet(); //获取所有key；
		Iterator<Peoplekey> it=k.iterator();
		while (it.hasNext()) {
			Peoplekey id=it.next();
			Object p=m.get(id); //通过key获取value
			System.out.println(id+""+p);
		}
	}

}
