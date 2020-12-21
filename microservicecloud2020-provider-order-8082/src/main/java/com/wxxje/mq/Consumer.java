package com.wxxje.mq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import com.rabbitmq.client.AMQP.BasicProperties;

/**
 * rabbitMQ消费者
 * @author 15824
 *
 */
public class Consumer {
	public static void main(String[] args) throws IOException, TimeoutException {
		//获取连接
		Connection connection = ConnectionUtil.getConnection();
		
		//创建频道
		Channel channel =connection.createChannel();
		
		//创建队列：并设置消息处理
		channel.queueDeclare(Producer.QHEUE_NAME,true,false,false,null);
		
		//监听消息
		DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
			
			
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties, byte[] body)
					throws IOException {
				// TODO Auto-generated method stub
				//路由key
				System.out.println("路由key为"+envelope.getRoutingKey());
				
				//交换机
				System.out.println("交换机为"+envelope.getExchange());
				
				//消息id
				System.out.println("消息id为："+envelope.getDeliveryTag());
				
				//收到的消息
				System.out.println("接受到的消息："+new String(body,"UTF-8"));
			
				System.out.println("");
				
				System.out.println("===============================");
			
				System.out.println("");
			}
			
			
		};
		/**
		 * 监听消息
		 * 参数一：队列名称
		 * 参数二:是否自动确认，设置为true表示接收到消息自动向mq回复，如果设置为false需要手动确认
		 */
		channel.basicConsume(Producer.QHEUE_NAME, true, defaultConsumer);
		
		
	}
}
