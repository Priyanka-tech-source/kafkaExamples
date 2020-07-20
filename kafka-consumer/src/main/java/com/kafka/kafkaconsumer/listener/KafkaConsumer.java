package com.kafka.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.kafkaconsumer.model.User;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = "kafkaExample" , groupId = "group_id")
	public void consume(String message)
	{
		System.out.println("Consumed message "+ message);
	}
	
	@KafkaListener(topics = "kafkaExampleJson" , groupId = "group_json" ,
			containerFactory = "kafkaListenerUserContainerFactory")
	public void consume(User user)
	{
		System.out.println("Consumed Json message "+ user);
	}

	
}
