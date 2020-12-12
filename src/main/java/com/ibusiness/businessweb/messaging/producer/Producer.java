package com.ibusiness.businessweb.messaging.producer;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

import javax.jms.Queue;
import javax.jms.Topic;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ibusiness.businessweb.dto.BusinessDto;
import com.ibusiness.businessweb.entity.Business;

@Component
public class Producer {

	@Autowired
	JmsTemplate jmsTemplate;
	
	@Autowired
    Topic topicBusinessDetails;
	
	public void sendBusinessman(BusinessDto object) {
		

		
		System.out.println("Sending Message: " + object);
		jmsTemplate.convertAndSend(topicBusinessDetails,object );
	
	}


	
}
