package javatest.base;
/*  Author: kevin
 *	Date: 2018年11月5日
**/

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestProperties.class})
public class TestMain {
	@Resource
	TestProperties testProperties;
	
	@Test
	public void test() {
		System.out.println("JdbcUrl: "+testProperties.getJdbcUrl());
	}
}
