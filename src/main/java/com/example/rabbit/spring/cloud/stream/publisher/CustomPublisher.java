package com.example.rabbit.spring.cloud.stream.publisher;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
@Slf4j
public class CustomPublisher {

    @Bean
    public Supplier<String> producer() {
        return () -> {
//            log.info("Publicando mensagem");
            return null;
        };
    }
}
