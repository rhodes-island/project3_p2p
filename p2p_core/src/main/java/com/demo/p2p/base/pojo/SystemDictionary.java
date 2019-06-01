package com.demo.p2p.base.pojo;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

//数据字典表
public class SystemDictionary {
    private Long id;//数据字典分类id

    private String sn;//分类的编号

    private String title;//主题

    private String intro;//介绍
    
    /**
	 * 返回当前的json字符串
	 * @return
	 */
	public String getJsonString(){
		Map<String,Object> json=new HashMap<>();
		json.put("id",id);
		json.put("sn", sn);
		json.put("title", title);
		return JSONObject.toJSONString(json);
	}

    public SystemDictionary() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }
}