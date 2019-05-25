package day03;

import java.util.Scanner;

import org.junit.Test;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
	@Test
	public void test() {
		System.out.print("请输入员工的数量：");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=1;i<=num;i++) {
			String[] q=new String[num];
			q[i]=scan.next();
		}
		
		
		
	}
	
	
	
	
}
