package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 * @author Bonnie
 *
 */
public class Test05 {
	
	//销售：张三，王五，alice
	//财务：李四，赵六
	//程序：mike，jerry，钱七
	//美工：jackson
	//前端：green，nick
	 @Test
	 public void test() {
		 Map<String,Integer> map=new HashMap<String,Integer>();
		 map.put("销售", 3);
		 map.put("财务", 2);
		 map.put("程序", 3);
		 map.put("美工", 1);
		 map.put("前端", 2);
		 System.out.println(map);
		 
		 Collection<String>col=map.keySet();
		 for(String str:col) {
			 System.out.println(str);
		 }
		 
		 Set<Entry<String,Integer>>set=map.entrySet();
		 for(Entry<String, Integer> en:set) {
			 System.out.println(set);
		 }
	 }
}
