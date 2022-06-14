package io.github.julucinho.kafka_consumer.configs;

import lombok.Getter;
import org.apache.kafka.clients.consumer.KafkaConsumer;

@Getter
public abstract class AbstractConsumer<K, V> implements Consumer<K, V> {

    protected final KafkaConsumer<K, V> kafkaConsumer;
    protected final ConsumerConfigs consumerProperties;
    protected final String topicName;

    protected AbstractConsumer(ConsumerConfigs consumerProperties, String topicName, String groupId) {
        this.consumerProperties = consumerProperties;
        this.topicName = topicName;
        this.kafkaConsumer = new KafkaConsumer<>(consumerProperties.getPropertiesForConsumerOf(groupId));
    }
}
