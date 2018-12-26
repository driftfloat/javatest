package javatest.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/*  Author: kevin
 *	Date: 2018年11月22日
**/
public class TestGeneric {
	@Test
	public void test1() {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		System.out.println(list1);
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "a");
		System.out.println(map);
	}
}
