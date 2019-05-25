package day03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
	@Test
	public void test01() throws ParseException {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入一个生产日期格式\"yyyy-MM-dd\"");
		String str=scan.next();
		System.out.println("输入一个数字(保质期的天数)");
		int str2=scan.nextInt();
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date date=df.parse(str);	
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		cal.setTime(date);
		cal.add(Calendar.DATE, +str2);
		cal.add(Calendar.WEEK_OF_MONTH, -2);
		cal.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println(cal);
	
	
	
	}
}
