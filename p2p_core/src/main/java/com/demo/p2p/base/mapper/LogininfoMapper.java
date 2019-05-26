package com.demo.p2p.base.mapper;

import com.demo.p2p.base.pojo.Logininfo;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LogininfoMapper {
	int insert(Logininfo record);

	int updateByPrimaryKey(Logininfo record);

	Logininfo selectByPrimaryKey(Long id);

	List<Logininfo> selectAll();

	/**
	 * 根据用户名查询用户数量
	 * 
	 * @param username
	 * @return
	 */
	int getCountByUsername(String username);

	/**
	 * 登陆
	 * 
	 * @param username
	 * @param encode
	 * @return
	 */
	Logininfo login(@Param("username") String username, @Param("password") String encode,
			@Param("userType") int userType);

	/**
	 * 按照类型查询用户类型数量
	 * 
	 * @param userManager
	 * @return
	 */
	int countByUserType(int userType);

}