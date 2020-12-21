package com.wxxje.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicecloud.api2020.entities.Dept;
import com.wxxje.dao.DeptDaoMapper;
import com.wxxje.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	DeptDaoMapper deptDaoMapper;
	
	
	@Override
	public void insertDetp(Dept dept) {
		// TODO Auto-generated method stub
		deptDaoMapper.insert(dept);
	}
	
}
