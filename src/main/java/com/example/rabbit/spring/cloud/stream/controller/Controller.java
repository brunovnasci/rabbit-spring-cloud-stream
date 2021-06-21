package com.example.rabbit.spring.cloud.stream.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final StreamBridge streamBridge;

    @GetMapping("/publish")
    public ResponseEntity<Response> publish() {
        boolean wasSent = streamBridge.send("producer-out-0", "hello world");
        return ResponseEntity.ok(new Response(wasSent));
    }

    @GetMapping("/process")
    public ResponseEntity<Response> process() {
        boolean wasSent = streamBridge.send("processor-in-0", "hello world");
        return ResponseEntity.ok(new Response(wasSent));
    }

    @AllArgsConstructor
    @Getter
    @Setter
    public static class Response {
        private Boolean mensagemEnviada;
    }
}
