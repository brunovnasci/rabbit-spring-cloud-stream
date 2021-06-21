package com.example.rabbit.spring.cloud.stream.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class CustomListener {

    @Bean
    public Consumer<String> consumer() {
        return message -> log.info("mensagem recebida: {}", message);
    }
}
