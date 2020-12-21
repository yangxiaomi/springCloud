package com.wxxje.mq.ttl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 	设置过期时间队列消息
 * @author 15824
 *
 */
@RestController
public class TtlProducer {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@RequestMapping("sendTTL")
	public void ttlMessageTest() {
		MessageProperties messageProperties = new MessageProperties();
		
		//设置消息过期时间，5秒
		messageProperties.setExpiration("5000");
		
		Message message = new Message("消息过期时间，5秒钟".getBytes(), messageProperties);
		//路由建与队列同名
		rabbitTemplate.convertAndSend("my_ttl_queue",message);
	}
}
