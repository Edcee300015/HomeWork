package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Bonnie
 *
 */
public class Test06 {
	@Test
	public void test() {
		String[] arr= {"one","two","three"};
		System.out.println(Arrays.toString(arr));
		List<String> list=new ArrayList<String>();
		for(int i=0;i<3;i++)
		list.add(arr[i]);
		System.out.println(list);
	}
}
