package abstractclass;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {
		DecimalFormat d=new DecimalFormat("0,000,000$");
		Number number=d.parse("1,000,100$");
		int s=number.intValue();
		System.out.println(s);
	}

}
