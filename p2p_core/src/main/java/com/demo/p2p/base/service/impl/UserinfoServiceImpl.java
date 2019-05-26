package com.demo.p2p.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.p2p.base.mapper.UserinfoMapper;
import com.demo.p2p.base.pojo.Userinfo;
import com.demo.p2p.base.service.UserinfoService;
@Service
public class UserinfoServiceImpl implements UserinfoService {
	@Autowired
	private UserinfoMapper userinfoMapper;
	@Override
	public void update(Userinfo userinfo) {
		int ret = this.userinfoMapper.updateByPrimaryKey(userinfo);
		if(ret == 0) {
			throw new RuntimeException("乐观锁失败，userinfo:"+userinfo.getId());
		}
		
	}
	@Override
	public void add(Userinfo userinfo) {
		this.userinfoMapper.insert(userinfo);
		
	}
	
	@Override
	public Userinfo get(Long id) {
		return this.userinfoMapper.selectByPrimaryKey(id);
	}

}
