package day02;

import java.util.Arrays;

import org.junit.Test;

/**
 * 将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
 * @author Bonnie
 *
 */
public class Test02 {
	@Test
	public void test01() {
		String str="123,456,789,012";
		String a="\\,";
		System.out.println(Arrays.toString(str.split(a)));
	}
}
