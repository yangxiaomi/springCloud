package com.wxxje.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced  //Rboo负载均衡
	public RestTemplate geTemplate() {
		return new RestTemplate();
	}
}
