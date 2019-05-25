package day03;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
	@Test
	public void test() throws ParseException {
		System.out.println("请输入身份证号码：");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		//\d{18}
		String regex="\\d{18}";
		boolean a=str.matches(regex);
		if(a) {
			String birthday=str.substring(6, 14);			
			DateFormat df=new SimpleDateFormat("yyyyMMdd");
			Date date=df.parse(birthday);
			System.out.println(date);
			Calendar cal=Calendar.getInstance();
			cal.setTime(date);
			System.out.println(cal);
			cal.add(Calendar.YEAR, +20);
			cal.set(Calendar.DAY_OF_WEEK, 4);
			System.out.println(cal);		
		}else {
			System.out.println("输入有误！");
		}
		
		
		
		
		
	}

}
