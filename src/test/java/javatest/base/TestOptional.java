package javatest.base;

import java.util.Optional;

import org.junit.Test;

/*  Author: kevin
 *	Date: 2018年11月22日
 *	JDK8新特性：使用Optional避免null导致的NullPointerException
 *	https://blog.csdn.net/aitangyong/article/details/54564100
**/
public class TestOptional {
	@Test
	public void test1() {
		// 参数不能是null
		Optional<Integer> optional1 = Optional.of(1);
		 
		// 参数可以是null
		Optional<Integer> optional2 = Optional.ofNullable(null);
		 
		// 参数可以是非null
		Optional<Integer> optional3 = Optional.ofNullable(2);
		System.out.println(optional1.isPresent());
		System.out.println(optional2.isPresent());
		System.out.println(optional3.isPresent());
		
		
		// -----------------
//		Optional<Integer> optional1 = Optional.ofNullable(null);
//		Optional<Integer> optional2 = Optional.ofNullable(null);
//		System.out.println(optional1 == optional2);// true
//		System.out.println(optional1 == Optional.<Integer>empty());// true
//		 
//		Object o1 = Optional.<Integer>empty();
//		Object o2 = Optional.<String>empty();
//		System.out.println(o1 == o2);// true
		//--------------------- 
	}
}
