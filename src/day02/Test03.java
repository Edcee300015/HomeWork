package day02;

import java.util.Arrays;

import org.junit.Test;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
	@Test
	public void test01() {
		String num="198.162.6.66";
		//.
		String a="\\.";
		
		System.out.println(Arrays.toString(num.split(a)));
	}
}
