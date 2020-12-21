package com.wxxje.service;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.microservicecloud.api2020.entities.Consumer;

public interface ConsumerService {

	public void insertDetp(Consumer consumer);
	
	public int deleteUser(int id);
	
	public IPage<Consumer> selectList(IPage<Consumer> page ,QueryWrapper<Consumer> queryWrapper);
	
	public int updateConsumer(Consumer consumer);
}
