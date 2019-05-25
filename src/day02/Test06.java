package day02;

import java.util.Scanner;

import org.junit.Test;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 * @author Bonnie
 *
 */
public class Test06 {
	
	@Test
	public void test01() {
		System.out.println("请输入一个电话：");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		
		System.out.println(test(str));
	}
	
	public static boolean test(String n) {
		//[0-9]\d{3,4}-[0-9]\d{7,8}
		String a="[0-9]\\d{2,5}-[0-9]\\d{6,9}";
		boolean b=n.matches(a);
		return b;
	}
	
	
	
}
