package com.wxxje.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservicecloud.api2020.entities.Dept;

@RestController
public class DeptController_Consumer {
	private static final String REST_URL_PREFIX = "http://microservicecloud2020-dept";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value= "/consumer/dept/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX+"/inserDept",dept , Boolean.class);
	}
}
