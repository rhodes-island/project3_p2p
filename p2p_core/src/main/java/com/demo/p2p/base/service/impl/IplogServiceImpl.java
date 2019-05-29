package com.demo.p2p.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.p2p.base.mapper.IplogMapper;
import com.demo.p2p.base.pojo.Iplog;
import com.demo.p2p.base.query.IplogQueryObject;
import com.demo.p2p.base.query.PageResult;
import com.demo.p2p.base.service.IplogService;

@Service
public class IplogServiceImpl implements IplogService {
	
	@Autowired
	private IplogMapper iplogMapper;
	
	@Override
	public PageResult query(IplogQueryObject qo) {
		System.out.println(qo.toString());
		int count = this.iplogMapper.queryForCount(qo);
		if(count > 0) {
			List<Iplog> list = this.iplogMapper.query(qo);
			return new PageResult(list, count, qo.getCurrentPage(), qo.getPageSize());
		}
		return PageResult.empty(qo.getPageSize()); 
	}

}
