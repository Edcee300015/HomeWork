package day06;

import java.io.File;
import java.util.Scanner;

import org.junit.Test;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 * @author Bonnie
 *
 */
public class Test05 {
	@Test
	public void test() {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入一个目录或者文件的名字：");
		String str=scan.next();
		File file=new File(str);
		System.out.println(remove(file));
				
	}
	
	public static boolean remove(File file) {
		if(file.exists()==false) {
			return false;
		}else {
			if(file.isFile()) {
				return file.delete();
			}
			if(file.isDirectory()) {
				File[] file1=file.listFiles();
				for(File nn:file1) {
					remove(nn);
				}
				return file.delete();
			}
			
		}
		return false;

	}
	
}
