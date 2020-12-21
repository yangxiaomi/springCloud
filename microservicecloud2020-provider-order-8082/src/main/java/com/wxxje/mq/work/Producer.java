package com.wxxje.mq.work;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * RabbitMQ工作队列
 * @author 15824
 *
 */
public class Producer {
	static final String QHEUE_NAME="work_queue";
	public static void main(String[] args) throws IOException, TimeoutException {
		//创建连接工厂
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		//主机地址：默认为localhost
		connectionFactory.setHost("127.0.0.1");
		
		//连接端口
		connectionFactory.setPort(5672);
		
		//虚拟主机名称：默认为/
		connectionFactory.setVirtualHost("/itcast");
		
		//连接用户名：默认为guest
		connectionFactory.setUsername("wujian");
		
		//连接密码：
		connectionFactory.setPassword("wujian");
		
		//创建连接
		Connection connection =connectionFactory.newConnection();
		
		//创建频道
		Channel channel = connection.createChannel();
		
		//声明队列
		/***
		 * 参数一：队列名称
		 * 参数二：是否定义持久化
		 * 参数三：是否独占本次连接
		 * 参数四：是否在不使用的时候自动删除队列
		 * 参数五：队列其他参数
		 */
		channel.queueDeclare(QHEUE_NAME,true,false,false,null);
		//要发送的消息
		for(int i=0;i<30;i++) {
			String message ="尼古拉特斯拉的大船渣力"+i;
			channel.basicPublish("", QHEUE_NAME, null, message.getBytes());
			System.out.println("已发送消息："+message);
		}
		//释放资源
		channel.close();
		connection.close();
	}
}
