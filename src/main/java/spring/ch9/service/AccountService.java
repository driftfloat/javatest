package spring.ch9.service;

import spring.ch9.entity.Account;

public interface AccountService {
	int transfet(Account a, Account b, int v);
	Account get(int id);
}
