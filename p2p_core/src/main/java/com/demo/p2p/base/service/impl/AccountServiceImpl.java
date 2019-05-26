package com.demo.p2p.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.p2p.base.mapper.AccountMapper;
import com.demo.p2p.base.pojo.Account;
import com.demo.p2p.base.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	//所有涉及修改账户的操作都进过这个方法
	public void update(Account account) {
		int ret = this.accountMapper.updateByPrimaryKey(account);
		if(ret == 0) {
			throw new RuntimeException("乐观锁失败，account:"+account.getId());
		}
		
	}

}
