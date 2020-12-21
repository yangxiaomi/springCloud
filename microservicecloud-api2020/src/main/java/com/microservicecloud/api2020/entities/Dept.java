package com.microservicecloud.api2020.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{
	private int id;//主键
	private String title;//部门名称
	private String icon;//来自哪个数据库，因为微服务架构可以

	
	

}
