package com.wxxje.coller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservicecloud.api2020.entities.Dept;
import com.wxxje.service.DeptService;

@RestController
public class DeptColler {
	@Autowired
	DeptService deptService;
	
	@RequestMapping(value = "/inserDept",method=RequestMethod.POST )
	public Boolean insertDept(@RequestBody Dept dept,HttpServletRequest requet) {
		deptService.insertDetp(dept);
		System.out.println("端口号"+requet.getServerPort());
		return true;
	}
}
