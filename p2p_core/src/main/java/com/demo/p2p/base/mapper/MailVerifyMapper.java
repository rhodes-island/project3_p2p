package com.demo.p2p.base.mapper;

import com.demo.p2p.base.pojo.MailVerify;

public interface MailVerifyMapper {

	int insert(MailVerify record);

	/**
	 * 根据UUID来查询对应的邮箱验证对象
	 * 
	 * @param uuid
	 * @return
	 */
	MailVerify selectByUUID(String uuid);

}