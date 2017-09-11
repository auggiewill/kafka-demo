/**
 * Project Name:kafka-demo
 * File Name:KafkaApplication.java
 * Package Name:com.auggie
 * Date:2017年9月8日下午5:55:06
 * Copyright (c) 2017, All Rights Reserved.
 * Company:东方金融-上海房产
 *
*/

package com.auggie;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.auggie.component.KafkaProducer;

/**
 * Describe:
 * 
 * 使用了相对比较旧的springboot版本1.4.2
 * 想要使用spring-boot-autoconfigure进行自动加载是报错
 * Caused by: java.lang.ClassNotFoundException: org.springframework.boot.context.annotation.DeterminableImports
 * 原因是使用了较高版本的spring-boot-autoconfigure
 * 
 * 因此使用原始的Auto Configuration进行Bean的load
 * 需要配置KafkaTemplate和ConcurrentKafkaListenerContainerFactory
 * 
 * 自动配置版本，check另一个demo kafka-demo-configutaion
 * .
 * ClassName:KafkaApplication <br/>
 * Date:     2017年9月8日 下午5:55:06 <br/>
 * @author   auggie
 * @version  
 * @since    JDK 1.8	 
 */
@SpringBootApplication
public class KafkaApplication {
	
	public static void main(String[] args) {
//		SpringApplication.run(KafkaApplication.class, args);
		
		ConfigurableApplicationContext context = new SpringApplicationBuilder(KafkaApplication.class).headless(false).run(args);
		KafkaProducer producer = context.getBean(KafkaProducer.class);
		producer.send();
        
	}

}

