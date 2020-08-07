package fanshe;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//通过反射机制获取类中的变量；

public class Fsgetclass {

	public static void main(String[] args) throws Exception {
		Class c=Class.forName("java.io.File");
		StringBuffer sb=new StringBuffer();
		//Class[] c2=c1.getDeclaredClasses();
		//for (Class c : c2) {		
		sb.append(Modifier.toString(c.getModifiers())+" "+"class"+" ");
		sb.append(c.getSimpleName()+"{\n");
		Field[] f=c.getDeclaredFields();//获取属性；
		for (Field field : f) {
			sb.append("  ");
			//field.getModifiers()//获取属性的修饰符返回Int类型Modifier.toString（）方法返回string类型
			sb.append(Modifier.toString(field.getModifiers())+" "); 
			//Class type =field.getType();
			//通过field.getType()获取属性类型再通过getSimpleName()返回其名字；
			sb.append(field.getType().getSimpleName()+" ");
			sb.append(field.getName()+"\n");
		}
		Method[] md=c.getDeclaredMethods(); //获取所有方法；
		for (Method method : md) {
			sb.append(Modifier.toString(method.getModifiers())+" "); //获取方法的修饰符；
			sb.append(method.getReturnType().getSimpleName()+" "); //获取方法的返回值类型；
			sb.append(method.getName()+"(");
			Class[] cs=method.getParameterTypes(); //获取方法里的形式参数列表
			for (Class n : cs) {
				sb.append(n.getSimpleName()+" ");
			}
			sb.append("){ }\n");
		}
		sb.append("}\n");
		System.out.println(sb);
	}
	//}
}
