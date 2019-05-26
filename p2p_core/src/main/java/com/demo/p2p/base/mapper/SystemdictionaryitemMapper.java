package com.demo.p2p.base.mapper;

import java.util.List;

import com.demo.p2p.base.pojo.Systemdictionaryitem;

public interface SystemdictionaryitemMapper {
	int insert(Systemdictionaryitem record);

    Systemdictionaryitem selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Systemdictionaryitem record);
    
	List<Systemdictionaryitem> listByParentSn(String sn);
}