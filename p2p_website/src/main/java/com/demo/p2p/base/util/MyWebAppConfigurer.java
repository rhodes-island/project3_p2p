package com.demo.p2p.base.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * 
 * @ClassName:  MyWebAppConfigurer   
 * @Description:TODO(配置对应的拦截器，相当于在配置文件里面配置拦截器的路径)   
 * @author: 583165647@qq.com 
 * @date:   2019年5月29日 上午9:53:26   
 *
 */
@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {
	@Autowired
	private LoginCheckInerceptor loginCheckInerceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// addPathPatterns("/**") 表示拦截所有的请求，
		// excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问
		//.excludePathPatterns("/login.do", "/register.do")后面不用接着点方法，因为会在我配置的拦截器里面惊醒判断
		registry.addInterceptor(loginCheckInerceptor).addPathPatterns("/**");
		/*super.addInterceptors(registry);    //较新Spring Boot的版本中这里可以直接去掉，否则会报错*/
		WebMvcConfigurer.super.addInterceptors(registry);
	}
	// 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
	// 这个方法是用来配置静态资源的，比如html，js，css，等等
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}
	
}
