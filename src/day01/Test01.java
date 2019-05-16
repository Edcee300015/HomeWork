package day01;
/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 * @author Bonnie
 *
 */
public class Test01 {
	public static void main(String[] args) {
		String str = "HelloWorld";
		String str1="  Hello   ";
		test1(str);
		test2(str);
		test3(str);
		test4(str);
		test5(str);
		test6(str1);
		test7(str);
		test8(str);
		test9(str);
		
		//以下自行调用test2,test3...等方法。
		//System.out.println("dd");
		//System.out.println(04);
	}
	/**
	 * 以当前方法为例，下面继续编写test2,test3...等方法。
	 * 每个方法中实现类描述中的一个需求。
	 * 当前方法实现:1输出字符串"HelloWorld"的字符串长度
	 * 
	 * test2实现:2:输出"HelloWorld"中"o"的位置
	 * 以此类推。
	 * @param str
	 */
	public static void test1(String str){
		System.out.println(str.length());
	}
	public static void test2(String str) {
		System.out.print(str.indexOf("o")+" ");
		System.out.println(str.indexOf("o",5));
	}
	public static void test3(String str) {
		System.out.println(str.indexOf("o",5));
	}
	public static void test4(String str) {
		System.out.println(str.substring(0,5));
	}
	public static void test5(String str) {
		System.out.println(str.substring(5,10));
	}
	public static void test6(String str1) {
		System.out.println(str1.trim());
	}
	public static void test7(String str) {
		System.out.println(str.charAt(5));
	}
	public static void test8(String str) {
		System.out.println(str.startsWith("h"));
		System.out.println(str.endsWith("ld"));
	}
	public static void test9(String str) {
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}
}
