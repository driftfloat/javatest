package base.string;
/*  Author: kevin
 *	Date: 2018年11月27日
**/

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class TestIntern {
	@Test
	public void intern() {
		String s0 = "aaa" ;
		String s1 = new String("aaa");
		System.out.println(s1 == s0);		// false
		String s2 = new String("aaa");
		System.out.println(s1 == s2);       // false
		String s3 = s1.intern();
		System.out.println(s1 == s3);  		// false
		String s4 = s1.intern();
		System.out.println(s3 == s4);       // true
		System.out.println(s3 == s0); 		// true
	}
}
