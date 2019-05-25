package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 *
 *
 */
public class Test08 {

	public static void main(String[] args) {
		Person no1=new Person("张三",25,"男",5000);
		Person no2=new Person("李四",26,"女",6000);
		System.out.println(no1);
		System.out.println(no2);
		String a=",";
		String q=no1.toString();
		String q1=no2.toString();
		System.out.println(q);
		String[] no11=q.split(a);
		String[] no22=q1.split(a);
		System.out.println(Arrays.toString(no11));
		System.out.println(Arrays.toString(no22));
		Scanner scan=new Scanner(System.in);
		String bb=scan.next();
		
			String zz=no11[0];
			boolean x=zz.equals(bb);
			if(x) {
				//String no111=no11.toString();
				System.out.println(Arrays.toString(no11));
			}else {
				System.out.println("不存在");
			
			
		}
	}
	
	
}
