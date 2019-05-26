package com.demo.p2p.base.mapper;

import java.util.List;

import com.demo.p2p.base.pojo.Account;

public interface AccountMapper {
	int insert(Account record);

	int updateByPrimaryKey(Account record);
	
	Account selectByPrimaryKey(Long id);

	
	List<Account> selectAll();
}