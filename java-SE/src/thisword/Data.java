package thisword;
//this是一个引用
public class Data {
	private int year;
	private int month;
	private int day;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;					//this.year指的是当前对象的year
	}
	public Data(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public Data() {
		this(2019,12,23);//调用其他构造方法
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
}
