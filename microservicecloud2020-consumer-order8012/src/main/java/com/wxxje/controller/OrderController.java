package com.wxxje.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wxxje.feign.HelloFeign;

@RestController
public class OrderController {
	@Autowired
	private HelloFeign helloFeign;
	
	@RequestMapping("/getDept/{name}")
	@HystrixCommand(fallbackMethod="fallbackHello")
	public String hello(@PathVariable String name) {
		return helloFeign.gethello(name);
	}
	
	//断路器方法，返回值要和方法一致，参数也一致
	//注意一个BUG，断路器刚启动时，第一次访就到断路器。不正常第一次进入断路器不算数
	public String fallbackHello(String name) {
		return "tony";//当发生异常时，直接放回默认值，这种形式也成为降级
	}
}
