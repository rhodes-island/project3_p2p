package com.demo.p2p.base.mapper;

import java.util.List;

import com.demo.p2p.base.pojo.Iplog;
import com.demo.p2p.base.query.IplogQueryObject;

public interface IplogMapper {
	//登录记录的删除：
	int insert(Iplog iplog);
	
	
	//查询当前页数据
	List<Iplog> query(IplogQueryObject qo);
	
	//高级查询总数
	int queryForCount(IplogQueryObject qo);
}