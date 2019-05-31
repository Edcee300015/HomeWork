package day06;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
	@Test
	public void test() throws IOException {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个目录的名字：");
		String str=scan.nextLine();
		File file=new File(str);
		if(file.exists()==false) {
			boolean isSuccess=file.createNewFile();
			System.out.println(isSuccess);
		}else {
			System.out.println("该目录已存在！");
			int i=1;
			List list=new ArrayList();
			String regex="\\.";
			String[] n=str.split(regex);
			Arrays.copyOf(n, 5);
			n[2]="_副本";
			n[3]=".txt";
			while(file.exists()) {
				list.add(n[0]);
				list.add(n[2]);
				list.add(i);
				list.add(n[3]);
				File file1=new File(list.toString());
				if(file1.exists()) {
					i++;
					list.clear();
				}else {
					System.out.println(file1.createNewFile());
				}
			}
		}
		
		
	}
}
