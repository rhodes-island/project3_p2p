package com.demo.p2p.base.mapper;

import com.demo.p2p.base.pojo.RealAuth;

public interface RealAuthMapper {
	
	int insert(RealAuth realAuth);
	
	RealAuth selectByPrimaryKey(Long id);
	
	int updateByPrimaryKey(RealAuth realAuth);
}