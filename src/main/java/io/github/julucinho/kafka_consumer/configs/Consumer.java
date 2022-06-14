package io.github.julucinho.kafka_consumer.configs;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.List;

public interface Consumer<K, V> {

    KafkaConsumer<K, V> getKafkaConsumer();
    void subscribeOn(List<String> topics);
    void subscribeOn(String topic);
    ConsumerRecords<K, V> consumeFor(Duration duration);

}
