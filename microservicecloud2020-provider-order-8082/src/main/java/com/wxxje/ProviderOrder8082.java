package com.wxxje;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("www.wxxje.dao")
public class ProviderOrder8082 {
	public static void main(String[] args) {
		SpringApplication.run(ProviderOrder8082.class, args);
	}
}
