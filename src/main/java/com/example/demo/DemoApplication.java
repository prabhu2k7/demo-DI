package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
		
		//we are calling two times but still one object - IOC handle it in singleton pattern only one time creating object - DI major feature!
		User1 user1 = context.getBean(User1.class);
		
		User1 user2 = context.getBean(User1.class);

	}

}
