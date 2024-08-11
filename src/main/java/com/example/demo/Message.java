package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Message {
	
	public String messageRunner() {
		
		int a=10;
		Logger logger=LoggerFactory.getLogger(Message.class);
		
		logger.info("This is loger inform and started");
		System.out.println("This is the message runner class");
		logger.info("This is the end of the program and stopped");
		return "Message runner";
		
		
	}

}
