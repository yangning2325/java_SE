package fanxing.linked;

public class Hero implements Comparable<Hero> {
	int height,weight;
	public Hero(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	//重写泛型接口里的方法
	public int compareTo(Hero o) { 
		
		return (o.weight-this.weight);//表示从大到小排列；
	}

}
