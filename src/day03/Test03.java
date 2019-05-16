package day03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

import org.junit.Test;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {

	@Test
	public void test01() {
		Scanner scan=new Scanner(System.in);
		String d1=scan.next();
		String regex="-";
		System.out.println(Arrays.toString(d1.split(regex)));
		String[] q=d1.split(regex);
		int year=Integer.valueOf(q[0]);
		int mon=Integer.valueOf(q[1]);
		int day=Integer.valueOf(q[2]);
		Calendar cal=Calendar.getInstance();
		long time=cal.getTimeInMillis();
		System.out.println(time);
	}
	
	
	
	
}
