package fengzhuang;

public class User {
	private String name;
	private int num;

	public User() {
//		name="yn";
//		num=2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num<4) {
			System.out.println("你输入的有误！");
		}else{
			this.num = num;
			}
		}
	}
