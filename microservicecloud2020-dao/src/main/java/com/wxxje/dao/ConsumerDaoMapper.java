package com.wxxje.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.microservicecloud.api2020.entities.Consumer;
import com.microservicecloud.api2020.entities.Dept;
@Mapper
public interface ConsumerDaoMapper extends BaseMapper<Consumer>{
	
}
