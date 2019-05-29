package com.demo.p2p.base.util;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 
 * @ClassName:  LoginCheckInerceptor   
 * @Description:TODO(专门用于登陆检查的拦截器)   
 * @author: 583165647@qq.com 
 * @date:   2019年5月29日 上午9:21:20   
 *
 */
@Component
public class LoginCheckInerceptor extends HandlerInterceptorAdapter {
	
	//重写preHandle方法
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//判断登录逻辑
		if(handler instanceof HandlerMethod) {
			HandlerMethod hm =(HandlerMethod)handler;
			RequireLogin rl = hm.getMethodAnnotation(RequireLogin.class);
			if(rl !=null && UserContext.getCurrent() ==null) {
				response.sendRedirect("/login.html");
				return false;
			}
		}
		return super.preHandle(request, response, handler);
	}
	
}
