package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Bonnie
 *
 */
public class Test03 {
	@Test
	public void test() {
		ArrayList<Object> col=new ArrayList<Object>();
		col.add("one");
		col.add("two");
		col.add("three");
		col.add("fore");
		System.out.println(col);
		//System.out.println(col.size());
		System.out.println(col.get(1));
		col.set(2, "3");
		System.out.println(col);
		col.add(1, "2");
		System.out.println(col);
		col.remove(2);
		System.out.println(col);
		
	}
	
	
	
	
	
}
