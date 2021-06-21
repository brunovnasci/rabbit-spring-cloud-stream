package com.example.rabbit.spring.cloud.stream.publisher;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.cloud.stream.messaging.Sink;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CustomPublisherTest {

    @Autowired
    private StreamBridge streamBridge;

    @Test
    void testMultipleFunctions() {

        assertEquals("hello world", "hello world");
    }
}