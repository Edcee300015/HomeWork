package day03;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
	@Test
	public void test01() {
		Date date=new Date();
		System.out.println(date);
		
		Calendar cal=Calendar.getInstance();
		date=cal.getTime();
		System.out.println(cal);
		cal.add(Calendar.DAY_OF_MONTH,3);
		
		System.out.println(cal);
	}
}
