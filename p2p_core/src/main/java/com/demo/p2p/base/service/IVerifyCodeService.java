package com.demo.p2p.base.service;

public interface IVerifyCodeService {
	/**
	 * 
	 * @Title: sendVerifyCode   
	 * @Description: TODO(给指定的手机发送验证码)   
	 * @param: @param phoneNumber      
	 * @return: void      
	 * @throws:
	 */
	void sendVerifyCode(String phoneNumber);
	
	/**
	 * 
	 * @Title: verify   
	 * @Description: TODO(用于验证手机验证码)   
	 * @param: @param phoneNumber
	 * @param: @param sendVerifyCode
	 * @param: @return      
	 * @return: boolean      
	 * @throws:
	 */
	boolean verify(String phoneNumber, String verifyCode);
}
