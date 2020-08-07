package object.equals;

public class Start {
	int id;
	String name;
	public Start(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	//要求：身份证一致，并且名字一致，则代表同一个人；
	//s1.equals(s2);
	public boolean equals(Object obj) {			//对object里的equals方法进行重写；
		if(this==obj) return true;	//this为s1,s2赋给obj;也就是说s1的内存地址与s2是同一个地址，那他们一定指向同一个对象
//			int id1=this.id;
//			int id2=obj.id;					因为父类型obj没有id这个属性，所以要强制类型转换；
			if(obj instanceof Start) {      	//进行类型判断
				Start s=(Start)obj;
				if(s.id==this.id&&s.name.equals(name)) {//String已经重写了object里的equals方法,字符串比较不能使用“==”；
					return true;
				}
			}
		return false;
		
	}

}
