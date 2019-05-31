package day05;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
		String str=scan.next();
		String regex=";";
		String regex1=",";
		String num=scan.next();
		List<Emp> list=new ArrayList<Emp>();
		String[] user=str.split(regex);
		for(int i=0;i<user.length;i++) {
			String[] q=user[i].split(regex1);
			DateFormat date=new SimpleDateFormat("yyyy-MM-dd");
			list.add(new Emp(q[0],Integer.parseInt(q[1]),q[2],Integer.parseInt(q[3]),date.parse(q[4])));			
		}
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Emp>(){

			@Override
			public int compare(Emp u1, Emp u2) {
				
				return u1.getHiredate().compareTo(u2.getHiredate());
			}
			
		});
		System.out.println(list);
	
		
		
	}
	
	
	
}
