package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
	@Test()
	public void test() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		System.out.println(list);
		List<Integer> str=list.subList(3, 7);
		System.out.println(str);		
		Integer[] arr=str.toArray(new Integer[0]);	
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]*10;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		list.remove(9);
		list.remove(8);
		list.remove(7);
		System.out.println(list);
	
	}
	
	
	
	
}
