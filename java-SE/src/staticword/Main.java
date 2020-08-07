package staticword;

public class Main {
	static {
		System.out.println("I LOVE YOU !");
	}
	{
		System.out.println("Are you understand my heat ?");
	}
	public static void main(String[] args) {
		Main m=new Main();
		Chinese yn=new Chinese();
		yn.name="杨宁";
		yn.num=520;
		System.out.println("姓名:"+yn.name);
		System.out.println("号码:"+yn.num);
		System.out.println("国籍:"+Chinese.country);
		Chinese zr=new Chinese();
		zr.name="呵呵呵";
		zr.num=520;
		System.out.println("姓名:"+zr.name);
		System.out.println("号码:"+zr.num);
		System.out.println("国籍:"+Chinese.country);

	}

}
