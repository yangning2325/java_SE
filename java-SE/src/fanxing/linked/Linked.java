package fanxing.linked;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import cleateclass.Addr;

public class Linked {

	public static void main(String[] args) {
		LinkedList<Hero>heros =new LinkedList<Hero>();
		heros.add(new Hero(170, 50));
		heros.add(new Hero(180, 60));
		heros.add(new Hero(175, 70));
		heros.add(new Hero(160, 90));
		heros.set(0, new Hero(172, 55)); //修改指定索引处的数据；
		//heros.clear();  //删除所有节点
		//heros.remove(0); //删除指定索引的数据
		heros.add(2, new Hero(190, 100)); //向指定节点索引后添加节点
		//Collections.sort(heros); //对节点按指定的排序方式进行排序
		//Collections.shuffle(heros); //对数组进行随机排列；
		//Collections.rotate(heros, 1); //将链表向右旋转 1 布（正表右，负表左）
		//Collections.reverse(heros); //反转列表
		Iterator<Hero> iterator=heros.iterator(); //遍历链表；
		System.out.println(iterator);
		while (iterator.hasNext()) {
			Hero h=iterator.next(); //后移
			System.out.println("身高"+h.height+"cm 体重："+h.weight+"kg");
		}
		Hero yn =new Hero(165, 80); 
		int index=Collections.binarySearch(heros, yn); //查找链表是否与该数据相等（按指定元素排序方式进行的对比）
		if (index>=0) {
			System.out.println("链表中已经存在这个数据");
		}else {
			System.out.println("这个数据不存在");
		}
		
	}

}
