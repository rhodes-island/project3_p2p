package com.demo.p2p.base.query;

import org.springframework.util.StringUtils;


/**
 * 视频认证的高级查询对象
 * 
 * @author Linv999
 *
 */
public class VedioAuthQueryObject extends AuditQueryObject {

	private String keyword;

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getKeyword() {
		return StringUtils.hasLength(keyword) ? keyword : null;
	}

}
