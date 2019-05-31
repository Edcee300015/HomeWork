package day06;

import java.io.File;
import java.util.Arrays;

import org.junit.Test;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Bonnie
 *
 */
public class Test04 {
	@Test
	public void test() {
		File file=new File("mpc");
		File[] fs=file.listFiles();
		System.out.println(Arrays.toString(fs));
		
		
		
	}
	
	
	
}
