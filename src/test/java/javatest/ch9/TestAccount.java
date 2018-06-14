package javatest.ch9;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import spring.ch9.entity.Account;
import spring.ch9.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:spring-ch9.xml"
		})
@WebAppConfiguration
public class TestAccount {
	@Resource
	private AccountService accountService;
	
	@Test
	public void transfet() throws Exception  {
		Account a = accountService.get(1);
		Account b = accountService.get(2);
		System.out.println(accountService.transfet(a, b, 100));
	}
}
