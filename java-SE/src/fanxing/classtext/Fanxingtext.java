package fanxing.classtext;

public class Fanxingtext {

	public static void main(String[] args) {
		Showobject<Dog> showdog=new Showobject<Dog>();
		showdog.ShowMess(new Dog());
		Showobject<Cat> showcat=new Showobject<Cat>();
		showcat.ShowMess(new Cat());
	}

}
class Showobject<E>{
	public void ShowMess(E e) {
		System.out.println(e);
	}
}
class Dog{
	public String toString() {
		return "A dog !";
	}
}
class Cat{
	public String toString() {
		return "This is a cat  !";
	}
}
	
