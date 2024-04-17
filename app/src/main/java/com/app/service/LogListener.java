package com.app.service;

import com.app.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LogListener {

    private final Logger logger = LoggerFactory.getLogger(LogListener.class);

    @KafkaListener(topics = "logger",groupId = "group-id")
    public void consume(String message){
        logger.info(String.format("Message receiver \n %s", message));
    }
}
