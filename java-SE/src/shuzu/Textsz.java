package shuzu;

public class Textsz {

	public static void main(String[] args) {
		Animal[] a=new Animal[4];
		Cat c1=new Cat();
		Cat c2=new Cat();
		Dog d1=new Dog();
		Dog d2=new Dog();
		a[0]=d1;
		a[1]=d2;
		a[2]=c1;
		a[3]=c2;
		for(int i=0;i<a.length;i++) {
			Animal a1=a[i];
			if(a1 instanceof Cat) {
				Cat c=(Cat)a1;
				c.eat();
			}
			if(a1 instanceof Dog) {
				Dog d=(Dog)a1;
				d.move();
			}
		}
	}

}
class Animal{
	
}
class Cat extends Animal{
	public void eat(){
		System.out.println("小猫爱吃鱼！");
	}
}
class Dog extends Animal{
	public void move() {
		System.out.println("小狗在奔跑！");
	}
}
