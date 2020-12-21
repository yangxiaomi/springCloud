package com.microservicecloud.api2020.entities;

import java.io.Serializable;
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
public class TbUser implements Serializable{
	private Integer id;
	private String username;
	private String phone;
	private String email;
	private Date created;
	private Date updated;
}
