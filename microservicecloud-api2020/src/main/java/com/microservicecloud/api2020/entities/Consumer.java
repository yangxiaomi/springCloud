package com.microservicecloud.api2020.entities;

import java.math.BigDecimal;
import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Consumer {
	private Integer id;
	private String username;
	private String passwrod;
	private Integer age;
	private String nickname;
	private BigDecimal money;
	private Date createtime;
	private Date updatetime;
	
}
