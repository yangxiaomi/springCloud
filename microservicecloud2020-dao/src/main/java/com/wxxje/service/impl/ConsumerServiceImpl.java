package com.wxxje.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.microservicecloud.api2020.entities.Consumer;
import com.wxxje.dao.ConsumerDaoMapper;
import com.wxxje.service.ConsumerService;
@Service
public class ConsumerServiceImpl implements ConsumerService{
	@Autowired
	ConsumerDaoMapper consumerDaoMapper;
	
	
	@Override
	public void insertDetp(Consumer consumer) {
		// TODO Auto-generated method stub
		consumerDaoMapper.insert(consumer);
	}


	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return consumerDaoMapper.deleteById(id);
	}




	@Override
	public int updateConsumer(Consumer consumer) {
		// TODO Auto-generated method stub
		return consumerDaoMapper.updateById(consumer);
	}


	@Override
	public IPage<Consumer> selectList(IPage<Consumer> page, QueryWrapper<Consumer> queryWrapper) {
		// TODO Auto-generated method stub
		return consumerDaoMapper.selectPage(page, queryWrapper);
	}




	
	
}
