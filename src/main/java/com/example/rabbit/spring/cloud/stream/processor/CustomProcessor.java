package com.example.rabbit.spring.cloud.stream.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.function.Function;

@Component
@Slf4j
public class CustomProcessor {

    @Bean
    public Function<String, String> processor() {
        return input -> {
            log.info("Processando mensagem recebida: {}", input);
            String processed = input.toUpperCase(Locale.ROOT);
            log.info("Mensagem recebida processada: {}", processed);
            return processed;
        };
    }
}
