package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Test07 test=new Test07();
		test.copy1("myfile_copy01.txt");
		test.copy2("myfile_copy02.txt");
	}
	/**
	 * 使用字节数组方式复制
	 * @param name 要复制的文件名
	 * @throws IOException 
	 */
	public static void copy1(String name) throws IOException{
		RandomAccessFile raf1=new RandomAccessFile("myfile.txt","rw");
		RandomAccessFile raf2=new RandomAccessFile(name,"rw");
		byte[] len =new byte[1024];
		int b=-1;
		while((b=raf1.read(len))!=-1) {
			raf2.write(len,0,b);
		}
	}
	/**
	 * 使用单字节形式复制
	 * @param name 要复制的文件名
	 * @throws IOException 
	 */
	public void copy2(String name) throws IOException{
		RandomAccessFile raf1=new RandomAccessFile("myfile.txt","rw");
		RandomAccessFile raf2=new RandomAccessFile(name,"rw");
		int len=-1;
		while((len=raf1.read())!=-1) {
			raf2.write(len);
		}
	}
}
