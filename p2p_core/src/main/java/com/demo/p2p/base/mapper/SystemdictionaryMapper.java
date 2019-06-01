package com.demo.p2p.base.mapper;

import java.util.List;

import com.demo.p2p.base.pojo.SystemDictionary;
import com.demo.p2p.base.query.SystemDictionaryQueryObject;

public interface SystemdictionaryMapper {
	int insert(SystemDictionary record);

	SystemDictionary selectByPrimaryKey(Long id);

	List<SystemDictionary> selectAll();
	
	int updateByPrimaryKey(SystemDictionary record);
	
	//分页的方法
	int queryForCount(SystemDictionaryQueryObject qo);
	
	List<SystemDictionary> query (SystemDictionaryQueryObject qo);
}