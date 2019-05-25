package day03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 * @author Bonnie
 *
 */
public class Test02 {
	@Test
	public void test01() {
		Date date=new Date();
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=df.format(date);
		System.out.println(str);
		
		
	}
}
