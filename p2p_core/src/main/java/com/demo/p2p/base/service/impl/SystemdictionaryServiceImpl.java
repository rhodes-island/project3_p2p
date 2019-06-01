package com.demo.p2p.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.p2p.base.mapper.SystemdictionaryMapper;
import com.demo.p2p.base.mapper.SystemdictionaryitemMapper;
import com.demo.p2p.base.pojo.SystemDictionary;
import com.demo.p2p.base.pojo.Systemdictionaryitem;
import com.demo.p2p.base.query.PageResult;
import com.demo.p2p.base.query.SystemDictionaryQueryObject;
import com.demo.p2p.base.service.SystemdictionaryService;

@Service
public class SystemdictionaryServiceImpl implements SystemdictionaryService {
	
	@Autowired
	private SystemdictionaryMapper systemdictionaryMapper;
	
	@Autowired
	private SystemdictionaryitemMapper systemdictionaryItemMapper;
	
	@Override
	public PageResult queryDics(SystemDictionaryQueryObject qo) {
		int count = this.systemdictionaryMapper.queryForCount(qo);
		if(count > 0) {
			List<SystemDictionary> list = this.systemdictionaryMapper.query(qo);
			return new PageResult(list, count, qo.getCurrentPage(), qo.getPageSize());
		}
		return PageResult.empty(qo.getPageSize());
	}
	
	//数据字典分类里的增加或者修改
	@Override
	public void saveOrUpdateDic(SystemDictionary dictionary) {
		//数据字典分类表里面有值就update
		if(dictionary.getId() != null) {
			this.systemdictionaryMapper.updateByPrimaryKey(dictionary);
		}else {
			//没有值就创建一个出来
			this.systemdictionaryMapper.insert(dictionary);
		}
		
	}
	
	//数据字典明细的分页查询
	@Override
	public PageResult queryItems(SystemDictionaryQueryObject qo) {
		int count = this.systemdictionaryItemMapper.queryForCount(qo);
		System.out.println(count);
		if(count > 0) {
			List<Systemdictionaryitem> list = this.systemdictionaryItemMapper.query(qo);
			return new PageResult(list, count, qo.getCurrentPage(), qo.getPageSize());
		}
		return PageResult.empty(qo.getPageSize());
	}

	@Override
	public void saveOrUpdateItem(Systemdictionaryitem item) {
		if(item.getId()!=null) {
			this.systemdictionaryItemMapper.updateByPrimaryKey(item);
		}else {
			this.systemdictionaryItemMapper.insert(item);
		}
		
	}

	@Override
	public List<SystemDictionary> listAllDics() {
		return systemdictionaryMapper.selectAll();
	}

	@Override
	public List<Systemdictionaryitem> listByParentSn(String sn) {
		return this.systemdictionaryItemMapper.listByParentSn(sn);
	}

}
