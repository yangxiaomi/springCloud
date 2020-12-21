package com.wxxje.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wxxje.mq.config.RabbieMQConfig;


@RestController
public class SendMsgController {
	//注入RabbitMQ的模板
	@Autowired
	private RabbitTemplate rabbitTemplate; 
	
	/**
	 * 	测试
	 */
	@GetMapping("/sendmsg")
	public String sendMsg(@RequestParam String msg,@RequestParam String key) {
		
		/**
		 * 	发送消息
		 * 	参数一：交换机
		 * 	参数二： 路由key
		 *	参数三：发送的消息
		 */
		rabbitTemplate.convertAndSend(RabbieMQConfig.ITEM_TOPIC_EXCHANGE,key,msg);
	
		return "发送成功";
	}
}
