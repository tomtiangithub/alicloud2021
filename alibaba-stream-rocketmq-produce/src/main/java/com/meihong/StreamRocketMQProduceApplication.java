package com.meihong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

/**
 * @author tch
 */
@SpringBootApplication
@EnableBinding(Source.class)
public class StreamRocketMQProduceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamRocketMQProduceApplication.class, args);
    }

}
