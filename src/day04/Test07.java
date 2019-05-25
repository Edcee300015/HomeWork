package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Test;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Bonnie
 *
 */
public class Test07 {
	@Test
	public void test() {
		Random ran=new Random();		
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			int qq=ran.nextInt(10);
			list.add(qq);			
		}
		System.out.println(list);
		Integer[] aa=list.toArray(new Integer[10]);
		int min;
		for(int i=0;i<10;i++) {			
			for(int j=i;j<10;j++) {
				if(aa[i]<aa[j]) {
					min=aa[i];
					aa[i]=aa[j];
					aa[j]=min;
				}
			}
		}
		System.out.println(Arrays.toString(aa));
		
		
		
		
	}
	
	
	
}
