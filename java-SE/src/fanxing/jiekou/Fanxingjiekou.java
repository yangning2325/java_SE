package fanxing.jiekou;

public class Fanxingjiekou {

	public static void main(String[] args) {
		Listen<Piano> yn=new Student();
		Piano p=new Piano();
		yn.listen(p);
		Listen<Violin> yn2=new Teacher();
		Violin v=new Violin();
		yn2.listen(v);

	}

}
interface Listen<E>{
	 void listen(E e);
	
}
class Student implements Listen<Piano>{
	public void listen(Piano p) {
		p.play();
	}
}
class Teacher implements Listen<Violin>{
	public void listen(Violin v) {
		v.play();
	}
}
class Violin{
	public void play() {
		System.out.println("黄河颂！");
	}
}
class Piano{
	public void play() {
		System.out.println("月光曲！");
	}
}
