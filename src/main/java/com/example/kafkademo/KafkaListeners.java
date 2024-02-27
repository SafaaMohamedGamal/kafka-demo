package com.example.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class KafkaListeners {

    Logger logger = Logger.getLogger(getClass().getName());

    @KafkaListener(topics = "demoTopic", groupId = "customGroup")
    void listener(String data){
        logger.log(Level.INFO, "Listener received : {0} \uD83D\uDE04", data);
    }
}
