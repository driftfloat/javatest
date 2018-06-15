package javatest.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.ch9.entity.Account;
import spring.ch9.service.AccountService;

/**
 * 
 * @author Administrator
 * http://www.itkeyword.com/doc/4402048923660866x475/how-to-configure-log4j-in-spring-for-mybatis-sql-queries  
 * 使用 log4j ，而不是 log-back
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:spring-ch9.xml"
		})
//@WebAppConfiguration
public class TestAccount {
	private Log log = LogFactory.getLog(TestAccount.class);
	
	@Resource
	private AccountService accountService;
	
	@BeforeClass
	public static void setup() throws SQLException, FileNotFoundException, IOException{
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}
	
	@Test
	public void transfet() throws Exception  {
		Account a = accountService.get(1);
		Account b = accountService.get(2);
		log.info(a);
		log.info(b);
		log.info("transfer:"+accountService.transfet(a, b, 100));
		log.info(a);
		log.info(b);
	}
}
