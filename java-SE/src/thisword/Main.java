package thisword;

public class Main {

	public static void main(String[] args) {
	Data data=new Data();			//data就是this，也就是说谁访问该对象this就是谁。但this不能存在于static方法中
	data.setYear(2019);
	data.setMonth(12);
	data.setDay(24);
	System.out.println(data.getYear()+"年"+data.getMonth()+"月"+data.getDay()+"日");

	}

}
