package com.demo.p2p.base.service;

import java.util.List;

import com.demo.p2p.base.pojo.SystemDictionary;
import com.demo.p2p.base.pojo.Systemdictionaryitem;
import com.demo.p2p.base.query.PageResult;
import com.demo.p2p.base.query.SystemDictionaryQueryObject;

/**
 * 
 * @ClassName:  SystemdictionaryService   
 * @Description:TODO(数据字典相关服务)   
 * @author: 583165647@qq.com 
 * @date:   2019年5月30日 下午3:26:19   
 *
 */
public interface SystemdictionaryService {
	
	//数字字典分类的查询
	PageResult queryDics(SystemDictionaryQueryObject qo);
	
	//根据数据字典分类查询明细
	List<Systemdictionaryitem> listByParentSn(String sn);
	
	//添加或修改
	void saveOrUpdateDic(SystemDictionary dictionary);
	
	//查询所有的数据字典明细
	List<SystemDictionary> listAllDics();
	
	 //数据字典明细的分页查询
	PageResult queryItems(SystemDictionaryQueryObject qo);

	 //修改或者保存数据字典明细
	void saveOrUpdateItem(Systemdictionaryitem item);
}
