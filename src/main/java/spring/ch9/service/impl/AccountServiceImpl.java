package spring.ch9.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.ch9.dao.AccountMapper;
import spring.ch9.entity.Account;
import spring.ch9.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Resource
	private AccountMapper accountMapper;
	
	@Override
	@Transactional
	public boolean transfet(Account a, Account b, int v) {
		a.setMoney(a.getMoney() - v);
		accountMapper.updateByPrimaryKeySelective(a);
		b.setMoney(b.getMoney() + v);
		accountMapper.updateByPrimaryKeySelective(b);
		return true;
	}

	@Override
	public Account get(int id) {
		return accountMapper.selectByPrimaryKey(id);
	}
}
