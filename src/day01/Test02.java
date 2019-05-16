package day01;

import org.junit.Test;

/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	
	@Test
	public void test01() {
		StringBuilder a=new StringBuilder("大家好");
		StringBuilder a1=a.append(",我是程序员！");
		System.out.println(a);
		System.out.println(a1);
		StringBuilder a3=a.insert(6,"优秀的");
		System.out.println(a3);
		StringBuilder a4=a3.replace(6,8,"牛牛");
		System.out.println(a4);
		StringBuilder a5=a3.delete(0,4);
		System.out.println(a5);
	}
}
