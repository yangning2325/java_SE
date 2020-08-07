package meiju;

public class Meiju_switch_text {

	public static void main(String[] args) {
		double price=0;
		boolean show=false;
		for (Meiju_switch m:Meiju_switch.values()) {
			switch (m) {
			case 苹果:
				show=true;
				price=2.5;
				break;
			case 梨:
				show=true;
				price=5.5;
				break;
			default:
				show=false;
				break;
			}
			if (show) {
				System.out.println(m+"的价格为："+price+"元");
			}
		}

	}

}
