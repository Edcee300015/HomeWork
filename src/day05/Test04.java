package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Test;



/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
	@Test
	public void test() {
		Map<String,Integer> map=new HashMap<String,Integer>();
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		map.put("语文",num);
		int num1=scan.nextInt();
		map.put("数学", num1);
		int num2=scan.nextInt();
		map.put("英语", num2);
		int num3=scan.nextInt();
		map.put("物理",num3);
		int num4=scan.nextInt();
		map.put("化学", num4);
		System.out.println(map);
		
		Integer str=map.get("物理");
		System.out.println(str);
		map.put("化学", 96);
		
		map.remove("英语");
		System.out.println(map);
		
		System.out.println("---------------------------");
		//用key迭代
		Set<String> set=map.keySet();
		
		for(String str1:set) {
			System.out.println(str1+"="+map.get(str1));
		}
		System.out.println("----------------------------");
		//用value迭代
		Collection<Integer> col=map.values();
		for(Integer in:col) {
			System.out.println(in);
		}
		
		
		System.out.println("-----------------------------");
		//用Entry迭代
		Set<Entry<String,Integer>> set1=map.entrySet();
		for(Entry<String,Integer> aa:set1) {
			System.out.println(aa.getKey()+"="+aa.getValue());
		}
		
		
		
	}
	
	
	
}
