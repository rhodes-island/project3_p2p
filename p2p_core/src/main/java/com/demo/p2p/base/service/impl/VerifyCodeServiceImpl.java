package com.demo.p2p.base.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.demo.p2p.base.util.GetMessageCode;
import com.demo.p2p.base.service.IVerifyCodeService;
import com.demo.p2p.base.util.BidConst;
import com.demo.p2p.base.util.DateUtil;
import com.demo.p2p.base.util.UserContext;
import com.demo.p2p.base.vo.VerifyCodeVO;

@Service
public class VerifyCodeServiceImpl implements IVerifyCodeService {

	@Override
	public void sendVerifyCode(String phoneNumber) {
		//判断当前是否能够发送短信
		//从session中获取最后一次发送短信的时间
		VerifyCodeVO vc = UserContext.getCurrentVerifyCode();
		if(vc == null || DateUtil.secondsBetween(new Date(), vc.getLastSendTime())>90) {
			//正常发送短信
			
			//生成验证码；
			String verifyCode =GetMessageCode.getCode(phoneNumber,3);
				/*UUID.randomUUID().toString().substring(0, 4);*/
			//发送短信
			System.out.println("给手机发送验证码"+verifyCode);
			//把手机号码.验证码，发送时间装配到vo中并保存到session
			vc = new VerifyCodeVO();
			vc.setVerifyCode(verifyCode);
			vc.setLastSendTime(new Date());
			vc.setPhoneNumber(phoneNumber);
			UserContext.putVerifyCode(vc);
		}else {
			throw new RuntimeException("发送过于频繁");
		}
	}

	@Override
	public boolean verify(String phoneNumber, String verifyCode) {
		//得到VerifyCode里面的对象
		VerifyCodeVO vc = UserContext.getCurrentVerifyCode();
		System.out.println(vc.toString());
		System.out.println( vc.getVerifyCode().equals(verifyCode));
		System.out.println( vc.getPhoneNumber().equals(phoneNumber));
		System.out.println(DateUtil.secondsBetween(vc.getLastSendTime(), new Date()) < BidConst.VERIFYCODE_VAILDATE_SECOND);
		//分别验证是否为空，手机验证码，手机号码，验证码有效期
		if(vc!=null 
				&& vc.getVerifyCode().equalsIgnoreCase(verifyCode)
				&& vc.getPhoneNumber().equals(phoneNumber) 
				&& DateUtil.secondsBetween(vc.getLastSendTime(), new Date()) <=BidConst.VERIFYCODE_VAILDATE_SECOND) {
			return true;
		}
			return false;
	}


}
