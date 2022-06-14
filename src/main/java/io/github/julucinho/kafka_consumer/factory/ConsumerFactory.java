package io.github.julucinho.kafka_consumer.factory;

import io.github.julucinho.kafka_consumer.configs.Consumer;
import io.github.julucinho.kafka_consumer.configs.impl.ConsumerImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConsumerFactory {

    public static Consumer<String, String> makeConsumerOf(String topicName, String consumerGroupId){
        return new ConsumerImpl(ConsumerConfigsFactory.makeConsumerConfigs(), topicName, consumerGroupId);
    }

}
