package fanshe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Fsgetshuxingzhi {

	public static void main(String[] args) throws Exception{
		Class c=Java.class;
		Field id=c.getDeclaredField("id"); //回去id属性；
		Object o=c.newInstance();   //创建一个对象 
		id.setAccessible(true); //打破封装；
		id.set(o, 12.5);    //给id重新复制
		System.out.println(Modifier.toString(id.getModifiers())); //输出修饰符；
		System.out.println(id.getType().getSimpleName());  //输出属性类型
		System.out.println(id.get(o)); //输出属性值
	}

}
