package com.demo.p2p.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.p2p.base.mapper.IplogMapper;
import com.demo.p2p.base.pojo.Iplog;
import com.demo.p2p.base.query.IplogQueryObject;
import com.demo.p2p.base.query.PageResult;
import com.demo.p2p.base.service.IplogService;
import com.demo.p2p.base.util.UserContext;

@Service
public class IplogServiceImpl implements IplogService {
	
	@Autowired
	private IplogMapper iplogMapper;
	
	@Override
	public PageResult query(IplogQueryObject qo) {
		//给这个方法里面赋值：对应的用户名
		qo.setUsername(UserContext.getCurrent().getUsername());
		int count = this.iplogMapper.queryForCount(qo);
		if(count > 0) {
			List<Iplog> list = this.iplogMapper.query(qo);
			return new PageResult(list, count, qo.getCurrentPage(), qo.getPageSize());
		}
		return PageResult.empty(qo.getPageSize()); 
	}

}
