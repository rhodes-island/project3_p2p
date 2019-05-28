package com.demo.p2p.base.service;

import com.demo.p2p.base.query.IplogQueryObject;
import com.demo.p2p.base.query.PageResult;

public interface IplogService {
	PageResult query(IplogQueryObject qo);
}
