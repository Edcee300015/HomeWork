package day06;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import org.junit.Test;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Bonnie
 *
 */
public class Test06 {
	@Test
	public void test() {
		File file = new File("mpc");

		File[] fs=file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				
				return pathname.isFile();
			}
			
		});
		
		
		System.out.println(Arrays.toString(fs));
		
		
		
		
	}
	
	
}
