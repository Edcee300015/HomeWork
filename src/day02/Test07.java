package day02;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {

	@Test
	public void test01() {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		//\+\-\*\/
		String q="\\+|\\-|\\*|\\/";
		String[] q1=str.split(q);
		//System.out.println(q1.length);
		//System.out.println(Arrays.toString(q1));
		Integer num1=Integer.valueOf(q1[0]);
		//System.out.println(q1[0]);
		Integer num2=Integer.valueOf(q1[1]);
		//System.out.println(q1[1]);
		//\d\.?\d?\+\d\.?\d?
		if(str.matches("\\d\\.?\\d?\\+\\d\\.?\\d?")) {
			System.out.println(num1+num2);
		}
		if(str.matches("\\d\\.?\\d?\\-\\d\\.?\\d?")) {
			System.out.println(num1-num2);
		}
		if(str.matches("\\d\\.?\\d?\\*\\d\\.?\\d?")) {
			System.out.println(num1*num2);
		}
		if(str.matches("\\d\\.?\\d?\\/\\d\\.?\\d?")) {
			System.out.println(num1/num2);
		}
	}
	
	
}
