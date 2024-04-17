package com.app.service;

import com.app.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final KafkaTemplate<String,Object> kafkaTemplate;

    public void create(ProductDto productDto){
        //save product
        kafkaTemplate.send("logger","Product is created successfully");
    }
}
