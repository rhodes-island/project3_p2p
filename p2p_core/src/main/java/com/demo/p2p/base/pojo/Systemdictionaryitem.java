package com.demo.p2p.base.pojo;


//数据字典明细
public class Systemdictionaryitem {
    private Long id;//数据字典id

    private Long parentid;//父类id

    private String title;//字典主题


    private Byte sequence;//顺序

    private String intro;//介绍

	public Systemdictionaryitem(Long id, Long parentid, String title, Byte sequence, String intro) {
		super();
		this.id = id;
		this.parentid = parentid;
		this.title = title;
		this.sequence = sequence;
		this.intro = intro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentid() {
		return parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
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
		return "Systemdictionaryitem [id=" + id + ", parentid=" + parentid + ", title=" + title + ", sequence="
				+ sequence + ", intro=" + intro + "]";
	}


}