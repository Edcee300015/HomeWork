package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
	@Test
	public void test() {
		Collection<Object> str=new ArrayList<Object>();
		str.add("one");
		str.add("two");
		str.add("three");
		System.out.println(str);
		System.out.println(str.size());
		System.out.println(str.isEmpty());
		System.out.println(str.contains("four"));
		str.clear();
		System.out.println(str);
		System.out.println(str.size());
		System.out.println(str.isEmpty());
		
		
	}
	
	
	
	
}
