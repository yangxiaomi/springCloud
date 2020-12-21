package com.wxxje;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("www.wxxje.dao")
public class BokeApplication8004 {
	public static void main(String[] args) {
		SpringApplication.run(BokeApplication8004.class, args);
	}
}
