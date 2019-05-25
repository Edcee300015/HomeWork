package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */


public class Test04 {
	
	public static String user(String User) {
		int a=User.indexOf("@");
		String a1=User.substring(0,a);
		return a1;
	}
	
	public static void main(String[] args) {
		Test04 A=new Test04();
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个邮箱!");
		String User=scan.next();
		System.out.println("用户名为："+A.user(User));	
	}
	
	
	
	
}
