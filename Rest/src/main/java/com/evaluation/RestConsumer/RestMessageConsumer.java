package com.evaluation.RestConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class RestMessageConsumer {

    private String result;

    @KafkaListener(topics = "topic-2", groupId = "my-group-id")
    public void listen(String message) {
        result = message;
    }

    public String getResult(){
        return result;
    }
}
