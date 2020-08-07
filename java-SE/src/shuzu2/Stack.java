package shuzu2;

public class Stack {
	Object[] elements;
	int index;
	public Stack( int max) {
		elements=new Object[max];
	}
	public Stack() {
		this(5);
	}
	public void push(Object element) throws StackException {
		if(index==elements.length) {
			throw new StackException("栈已满！");
		}
		elements[index++]=element;
		
	}
	public Object pop() throws StackException {
		if(index==0) {
			throw new StackException("栈已空！");
		}
		return elements[--index];
	}
}
