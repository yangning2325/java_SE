package shuzu2;

public class Test {

	public static void main(String[] args) {
		Stack s=new Stack();
		User u1=new User("a",1);
		User u2=new User("b",2);
		User u3=new User("c",3);
		User u4=new User("e",4);
		User u5=new User("d",5);
		try {
			s.push(u1);
			s.push(u2);
			s.push(u3);
			s.push(u4);
			s.push(u5);
			s.push(u5);
		} catch (StackException e) {
			
			e.printStackTrace();
		}

		try {
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
		} catch (StackException e) {
			
			e.printStackTrace();
		}

	}

}
