package day03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {

	@Test
	public void test01() throws ParseException {
		System.out.println("输入某人生日，格式为\"yyyy-MM-dd\"");
		Scanner scan=new Scanner(System.in);
		String d1=scan.next();		
		//String s1="yyyy-MM-dd";
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		//String str=df.format(d1);
		Date date1 =df.parse(d1);
		System.out.println(date1);
		long time1=date1.getTime();
		System.out.println(time1);
		Date date2=new Date();
		System.out.println(date2);
		long time2=date2.getTime();
		System.out.println(time2);
		long time=(time2-time1)/1000/60/60/60/7;
		System.out.println("经过了"+time+"周");
	}
	
	
	
	
}
