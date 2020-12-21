package com.wxxje.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.microservicecloud.api2020.entities.Consumer;
import com.microservicecloud.api2020.entities.Dept;
import com.microservicecloud.api2020.entities.TbUser;
@Mapper
public interface TbUserDaoMapper extends BaseMapper<TbUser>{
	
	@Select("select count(*) from tb_user where ${paraType} = #{param}")
	public Integer check(@Param("paraType")String paraType,@Param("paraType")String param);
}
