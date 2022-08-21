package de.oscharko.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * --------------------
 * Created by oscharko on 21.08.22 - 15:04 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Kafka-Messaging-System
 * Inside the package - de.oscharko.kafka.consumer
 * --------------------
 */
@Service
public class HelloKafkaConsumer {

    @KafkaListener(topics = "t-hello")
    public void consume(String message) {
        System.out.println(message);
    }

}
