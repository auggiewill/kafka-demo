/**
 * Project Name:kafka-demo
 * File Name:KafkaProducer.java
 * Package Name:com.auggie.component
 * Date:2017年9月11日上午9:36:04
 * Copyright (c) 2017, All Rights Reserved.
 * Company:东方金融-上海房产
 *
*/

package com.auggie.component;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

/**
 * Describe:(描述).
 * ClassName:KafkaProducer <br/>
 * Date:     2017年9月11日 上午9:36:04 <br/>
 * @author   auggie
 * @version  
 * @since    JDK 1.8	 
 */
@Component
public class KafkaProducer {

	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
	
	public void send() {
		kafkaTemplate.send("kafkatopic", "hahahaha");
		System.out.println("producer send " + "hahahaha");
		
		kafkaTemplate.setProducerListener(new ProducerListener<String, String>() {
			
			@Override
			public void onSuccess(String topic, Integer partition, String key, String value, RecordMetadata recordMetadata) {
				System.out.println("success");
			}
			
			@Override
			public void onError(String topic, Integer partition, String key, String value, Exception exception) {
				
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isInterestedInSuccess() {
				
				// TODO Auto-generated method stub
				return false;
			}
		});
	}
	
	
	
	
}

