package day05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test01 {
	@Test
	public void test() {
		Queue<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		Iterator<Integer> num=list.iterator();
		while(num.hasNext()) {
			Integer n=num.next();
			System.out.println(n);
		}
		
		
		
	}
}
