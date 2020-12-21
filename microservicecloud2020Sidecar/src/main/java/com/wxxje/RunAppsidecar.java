package com.wxxje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class RunAppsidecar {
	public static void main(String[] args) {
		SpringApplication.run(RunAppsidecar.class, args);
	}
}
