package com.demo.p2p.base.mapper;

import java.util.List;

import com.demo.p2p.base.pojo.Systemdictionary;

public interface SystemdictionaryMapper {
	int insert(Systemdictionary record);

	Systemdictionary selectByPrimaryKey(Long id);

	List<Systemdictionary> selectAll();

	int updateByPrimaryKey(Systemdictionary record);
}