package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		Double.parseDouble(str);
		String a="\\D+";
		boolean regex=str.matches(a);
		if(regex==false) {
			String b="\\d+\\.\\d";
			boolean regex1=str.matches(b);
			if(regex1) {
				int c=str.indexOf(".");
				String num=str.substring(0, c);
				Integer num1=Integer.valueOf(num);
				Double str1=Double.valueOf(str);	
					System.out.println(str1*5);				
			}else {
				Integer q=Integer.valueOf(str);
				System.out.println(q*10);
			}
			
		}else {
			System.out.println("该字符串不是数字");
		}
		

	}
}
