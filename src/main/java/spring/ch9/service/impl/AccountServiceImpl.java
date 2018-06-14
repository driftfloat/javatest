package spring.ch9.service.impl;

import javax.annotation.Resource;

import spring.ch9.dao.AccountMapper;
import spring.ch9.entity.Account;
import spring.ch9.service.AccountService;

public class AccountServiceImpl implements AccountService {

	@Resource
	private AccountMapper accountMapper;
	
	@Override
	public int transfet(Account a, Account b, int v) {
		a.setMoney(a.getMoney() - v);
		accountMapper.updateByPrimaryKeySelective(a);
		b.setMoney(b.getMoney() + v);
		accountMapper.updateByPrimaryKeySelective(b);
		return 1;
	}

	@Override
	public Account get(int id) {
		return accountMapper.selectByPrimaryKey(id);
	}
}
