package com.demo.p2p.base.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @ClassName:  RequireLogin   
 * @Description:TODO(用来标记登录的标签)   
 * @author: 583165647@qq.com 
 * @date:   2019年5月29日 上午8:36:37   
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequireLogin {

}
