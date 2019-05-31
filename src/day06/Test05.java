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
		boolean a=file.exists();
		System.out.println(a);
		if(file.isFile()) {
			boolean b=file.delete();
			System.out.println(b);
		}else {
			
		}
			
	}
	
	public static boolean remove(File n) {
		if(n.isDirectory()) {
			
		}
		return false;
	}
	
	
	
	
}
