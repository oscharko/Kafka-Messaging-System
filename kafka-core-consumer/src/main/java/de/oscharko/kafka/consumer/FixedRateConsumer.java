package de.oscharko.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * IntelliJ IDEA 2022.2 (Ultimate Edition)
 * --------------------
 * Created by oscharko on 21.08.22 - 15:50 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Kafka-Messaging-System
 * Inside the package - de.oscharko.kafka.consumer
 * --------------------
 */
@Service
public class FixedRateConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(FixedRateConsumer.class);

    @KafkaListener(topics = "t-fixed-rate")
    public void consume(String message) {
        LOG.info("Received message: " + message);
    }

}
