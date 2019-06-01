package com.demo.p2p.base.mapper;

import java.util.List;

import com.demo.p2p.base.pojo.Systemdictionaryitem;
import com.demo.p2p.base.query.SystemDictionaryQueryObject;

public interface SystemdictionaryitemMapper {
	int insert(Systemdictionaryitem record);

    Systemdictionaryitem selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Systemdictionaryitem record);
    
	/**
	 * 分页相关的查询
	 */
	int queryForCount(SystemDictionaryQueryObject qo);
	List<Systemdictionaryitem> query(SystemDictionaryQueryObject qo);
	
	//根据数据字典分类sn查询明细
	List<Systemdictionaryitem> listByParentSn(String sn);
}