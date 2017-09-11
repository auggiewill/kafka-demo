/**
 * Project Name:kafka-demo
 * File Name:KafkaConsumer.java
 * Package Name:com.auggie.component
 * Date:2017年9月11日上午9:39:40
 * Copyright (c) 2017, All Rights Reserved.
 * Company:东方金融-上海房产
 *
*/

package com.auggie.component;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Describe:(描述).
 * ClassName:KafkaConsumer <br/>
 * Date:     2017年9月11日 上午9:39:40 <br/>
 * @author   auggie
 * @version  
 * @since    JDK 1.8	 
 */
@Component
public class KafkaConsumer {

	@KafkaListener(topics = {"kafkatopic"})
    public void process(String msg) {
        System.out.println(msg);
    }
}

