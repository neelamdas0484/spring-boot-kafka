package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class SpringBootKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaApplication.class, args);
	}
	
	@KafkaListener(topics = "java_in_use_topic1", groupId = "group_id")
	public void consume(String message){
		System.out.println("Received message :: "+message);
	}

}
