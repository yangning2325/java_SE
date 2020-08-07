package fanxing.treeset;

import java.util.Comparator;
//构建比较器
public class Compare implements Comparator<People> {

	public int compare(People o1, People o2) {
		int a1=Integer.parseInt(o1.height);
		int a2=Integer.parseInt(o2.height);
		//return a1-a2; //从小到大
		return a2-a1; //从大到小
	}

}
