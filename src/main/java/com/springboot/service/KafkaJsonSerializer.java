package com.springboot.service;

import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class KafkaJsonSerializer implements Serializer {

	@Override
    public void configure(Map map, boolean b) {

    }
	
	@Override
	public byte[] serialize(String topic, Object data) {
		byte[] retVal = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            retVal = objectMapper.writeValueAsBytes(data);
        } catch (Exception e) {
            System.out.println("Exception in serialize :: "+e.getMessage());
        }
        return retVal;
	}
	
	@Override
    public void close() {

    }

}
