package de.oscharko.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * --------------------
 * Created by oscharko on 21.08.22 - 14:23 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Kafka-Messaging-System
 * Inside the package - de.oscharko.kafka.producer
 * --------------------
 */
@Service
public class HelloKafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendHello(String name) {
        kafkaTemplate.send("t-hello", "Hello " + name);
    }
}
