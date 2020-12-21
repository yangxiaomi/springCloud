package com.wxxje;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wxxje.dao")//mybatis扫面接口
public class ProviderDept8081 {
	public static void main(String[] args) {
		SpringApplication.run(ProviderDept8081.class, args);
	}
}
