package com.demo.p2p.base.pojo;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

//数据字典明细
public class Systemdictionaryitem {
	private Long id;// 数据字典id

	private Long parentId;// 父类id

	private String title;// 字典主题

	private Byte sequence;// 顺序

	private String intro;// 介绍

	/**
	 * 返回当前的json字符串
	 * 
	 * @return
	 */
	public String getJsonString() {
		Map<String, Object> json = new HashMap<>();
		json.put("id", id);
		json.put("parentId", parentId);
		json.put("title", title);
		json.put("sequence", sequence);
		return JSONObject.toJSONString(json);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Byte getSequence() {
		return sequence;
	}

	public void setSequence(Byte sequence) {
		this.sequence = sequence;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	@Override
	public String toString() {
		return "Systemdictionaryitem [id=" + id + ", parentId=" + parentId + ", title=" + title + ", sequence="
				+ sequence + ", intro=" + intro + "]";
	}

}