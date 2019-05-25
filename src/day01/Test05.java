package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String a="0123456789qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
		char[] b=new char[5];
		for(int i=0;i<5;i++) {
			Random random=new Random();
			int num=random.nextInt(a.length());
			b[i]=a.charAt(num);
			System.out.print(b[i]+" ");
		}
		String str = a.valueOf(b);
		System.out.println();
		System.out.print("请输入验证码：");
		System.out.println(Haha(str));		
	}
		public static boolean Haha(String n) {
			Scanner scan=new Scanner(System.in);
			String qq=scan.next();
			boolean q=qq.equalsIgnoreCase(n);
			return q;
		}
		
	
	
	
}
