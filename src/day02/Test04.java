package day02;

import org.junit.Test;

/**
 * 将字符串"123abc456def789ghi"中的英文部分替换为"#char#"
 * @author Bonnie
 *
 */
public class Test04 {
	@Test
	public void test01() {
		String str="123abc456def789ghi";
		String a="(abc|def|ghi)+";
		
		System.out.println(str.replaceAll(a,"#char#"));
	}
}
