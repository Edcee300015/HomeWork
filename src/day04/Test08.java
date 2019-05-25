package day04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
	@Test
	public void test() throws ParseException {
		Date date=new Date();
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入第1个日期为：yyyy-MM-dd格式");
		String str1=scan.next();
		System.out.println("请输入第2个日期为：yyyy-MM-dd格式");
		String str2=scan.next();
		System.out.println("请输入第3个日期为：yyyy-MM-dd格式");
		String str3=scan.next();
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=df.parse(str1); 
		Date date2=df.parse(str2);
		Date date3=df.parse(str3);
		System.out.println(date1);
		List<Date> list=new ArrayList<Date>();
		list.add(date1);
		list.add(date2);
		list.add(date3);
		Collections.sort(list);
		for(Date a:list) {
			System.out.println(a);
		}
		
	}
	
	
	
}
