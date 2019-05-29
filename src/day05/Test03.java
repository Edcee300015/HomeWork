package day05;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
	public static void main(String[] args) throws ParseException {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入成员信息：name,age,gender,salary,hiredate");
		String number=scan.next();	//!	
		String aa=" ";
		System.out.println(Arrays.toString(number.split(aa)));
//		String[] str=number.split(aa);
//		System.out.println(Arrays.toString(str));

		
		
		
		
//		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
//		Date date1=df.parse("2006-02-15");
//		String d1=df.format(date1);
//		System.out.println(d1);
//		System.out.println(date1);	
//		Emp num1=new Emp("张三",25,"男",5000,date1);
		
		
		
		
	}
	
	
	
}
