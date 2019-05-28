package com.demo.p2p.base.mapper;



import com.demo.p2p.base.pojo.Userinfo;

public interface UserinfoMapper {
	int insert(Userinfo record);

	Userinfo selectByPrimaryKey(Long id);

	int updateByPrimaryKey(Userinfo record);
	

}