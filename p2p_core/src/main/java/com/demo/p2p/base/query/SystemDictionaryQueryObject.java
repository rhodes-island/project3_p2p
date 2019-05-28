package com.demo.p2p.base.query;

import org.springframework.util.StringUtils;


/**
 * 数据字典 字典明细 相关的高级查询
 * @author Linv999!
 *
 */
public class SystemDictionaryQueryObject extends QueryObject {

	private String keyword ;
	private Long parentId ;
	
	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	/**
	 * 判断是否空字符串  也设置为null
	 * @return
	 */
	public String getKeyword(){
		return StringUtils.hasLength(keyword) ? keyword : null ;
	}
	
}
