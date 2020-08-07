package superword;

public class Father {
	private String name;
	private int money;
	public void play() {
		System.out.println("踢足球！");
	}
	public String getName() {
		return name;
	}
	public Father(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	public Father() {
		//this("杨宁",100000);
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
