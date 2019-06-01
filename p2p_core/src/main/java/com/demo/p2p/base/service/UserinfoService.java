package com.demo.p2p.base.service;

import com.demo.p2p.base.pojo.Userinfo;

/**
 * 
 * @ClassName: UserinfoService
 * @Description:TODO(用户相关信息)
 * @author: 583165647@qq.com
 * @date: 2019年5月26日 下午2:43:13
 *
 */
public interface UserinfoService {
	// 乐观锁
	void update(Userinfo userinfo);

	// 添加userinfo信息
	void add(Userinfo userinfo);

	Userinfo get(Long id);

	// 绑定手机号
	void bindPhone(String phoneNumber, String sendVerifyCode);

	// 发送绑定邮箱邮件
	void sendVerifyEmail(String mail);

	// 直接得到当前的Userinfo对象
	Userinfo getCurrent();

	// 执行邮箱绑定
	void bindEmail(String uuid);

	// 跟新用户的专用方法
	void updateBasicInfo(Userinfo userinfo);
}
