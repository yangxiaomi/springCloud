package com.wxxje.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//调用服务提供者
@FeignClient("microservicecloud2020-order")
public interface HelloFeign {
	@RequestMapping("/getDeptById/{name}")
	public String gethello(@PathVariable("name") String name);
}
