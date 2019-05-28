package com.demo.p2p.base.service;


import com.demo.p2p.base.pojo.Logininfo;

/**
 * //先从接口开始写
 * 
 * @ClassName: LogininfoService
 * @Description:TODO(登录相关服务)
 * @author: 583165647@qq.com
 * @date: 2019年5月23日 上午11:28:20
 *
 */
public interface LogininfoService {

	Logininfo selectByPrimaryKey(Long id);

	int insert(String username, String password);

	boolean checkUserName(String username);

	Logininfo login(String username, String password,int usertype,String request);
	
	
	
}
