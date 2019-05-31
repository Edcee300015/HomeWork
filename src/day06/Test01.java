package day06;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2017-06-30 14:22:16
 * @author Bonnie
 *
 */
public class Test01 {
	@Test
	public void test() throws IOException {
		File file=new File("myfile1.txt");
		System.out.println(file.exists());
		
		boolean isSuccess=file.createNewFile();
		System.out.println(isSuccess);
		
		System.out.println(file.length());
		
		String str=file.getName();
		System.out.println(str);
		
		long time=file.lastModified();
		System.out.println(time);
		Date date=new Date();
		date.setTime(time);
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String aa=df.format(date);
		System.out.println(aa);
		
		
		
	}
	

}
