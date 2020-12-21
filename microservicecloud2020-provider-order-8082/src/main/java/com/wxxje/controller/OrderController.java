package com.wxxje.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wxxje.service.DeptService;

@RestController
public class OrderController {
	@Autowired
	DeptService deptService;
	
	@RequestMapping("/getDeptById/{name}")
	public String getHello(@PathVariable String name,HttpServletRequest httpRequest) {
		return "端口"+httpRequest.getServerPort()+"hello+"+name;
	}
}
