package com.demo.p2p.base.service;

import com.demo.p2p.base.pojo.Account;

public interface AccountService {
	//支持乐观锁用
	void update(Account account);
}
