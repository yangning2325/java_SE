package cleateclass;

public class Main {

	public static void main(String[] args) {
		People yn=new People();
		yn.name="杨宁";
		yn.num=123;
		yn.addr=new Addr();
		yn.addr.city="烟台";
		yn.addr.street="东村街道";
		System.out.println(yn.name+yn.addr.city+yn.addr.street);

	}

}
