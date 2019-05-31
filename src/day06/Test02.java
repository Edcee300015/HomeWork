package day06;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
	
	@Test
	public void test() throws IOException {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入一个文件名");
		String str=scan.next();
		File file=new File(str);
		if(file.exists()==false) {
			file.mkdir();
			System.out.println(file.exists());			
		}else {
			int i=1;		
			String regex=".";
			Object[] q=str.split(regex);
			Arrays.copyOf(q, 4);
			q[1]="_副本";
			q[3]=".txt";
			
			while(file.exists()) {
				//String n=String.valueOf(i);
				q[2]=i;
				File file1=new File(q.toString());
				file1.mkdir();
				i++;
			}
		}
		
		
	}


}
