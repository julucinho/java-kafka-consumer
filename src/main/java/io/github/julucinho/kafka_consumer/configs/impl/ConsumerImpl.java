package io.github.julucinho.kafka_consumer.configs.impl;

import io.github.julucinho.kafka_consumer.configs.AbstractConsumer;
import io.github.julucinho.kafka_consumer.configs.ConsumerConfigs;
import org.apache.kafka.clients.consumer.ConsumerRecords;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class ConsumerImpl extends AbstractConsumer<String, String> {

    public ConsumerImpl(ConsumerConfigs consumerProperties, String topicName, String groupId) {
        super(consumerProperties, topicName, groupId);
        this.subscribeOn(topicName);
    }

    @Override
    public void subscribeOn(List<String> topics) {
        this.getKafkaConsumer().subscribe(topics);
    }

    @Override
    public void subscribeOn(String topic) {
        this.getKafkaConsumer().subscribe(Collections.singletonList(topic));
    }

    @Override
    public ConsumerRecords<String, String> consumeFor(Duration duration) {
        return this.getKafkaConsumer().poll(duration);
    }


}
