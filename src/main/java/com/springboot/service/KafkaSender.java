package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public static String kafkaTopic = "java_in_use_topic1";

	public void send(String message) {

		kafkaTemplate.send(kafkaTopic, message);
	}
}
