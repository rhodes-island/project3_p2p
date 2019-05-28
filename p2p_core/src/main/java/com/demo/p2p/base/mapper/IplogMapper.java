package com.demo.p2p.base.mapper;

import java.util.List;

import com.demo.p2p.base.pojo.Iplog;

public interface IplogMapper {
	int insert(Iplog iplog);
	
	List<Iplog> selectAll();
}