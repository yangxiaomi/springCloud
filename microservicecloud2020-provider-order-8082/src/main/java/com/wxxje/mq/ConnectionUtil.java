package com.wxxje.mq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ConnectionUtil {
	public static Connection getConnection() throws IOException, TimeoutException {
		//创建连接工厂
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		//主机连接地址
		connectionFactory.setHost("127.0.0.1");
		
		//连接端口
		connectionFactory.setPort(5672);
		
		//虚拟主机名称
		connectionFactory.setVirtualHost("/itcast");
		
		//连接用户名
		connectionFactory.setUsername("wujian");
		
		//连接密码
		connectionFactory.setPassword("wujian");
		
		//创建连接
		return connectionFactory.newConnection();
	}
}
