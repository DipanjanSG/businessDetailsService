package com.ibusiness.businessweb.messaging.consumer;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

import com.ibusiness.businessweb.dto.BusinessDto;
import com.ibusiness.businessweb.messaging.JmsConfig;
import com.ibusiness.businessweb.messaging.producer.Producer;
import com.ibusiness.businessweb.services.BusinessService;

@Component
public class Consumer {
	
		@Autowired
		Producer producer;
		
		@Autowired
		private BusinessService businessService;
		
	    @JmsListener(destination = JmsConfig.TOPIC_BUSINESSMAN_ID)
	    public void consume(@Headers MessageHeaders x ,String id) {
	        System.out.println("Received Message: " + id);
	        producer.sendBusinessman(businessService.getBusinessemenByBusinessmanId(Integer.parseInt(id)));
	    }
	    
}
  