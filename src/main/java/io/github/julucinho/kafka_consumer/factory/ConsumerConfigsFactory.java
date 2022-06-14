package io.github.julucinho.kafka_consumer.factory;

import io.github.julucinho.kafka_consumer.configs.ConsumerConfigs;
import io.github.julucinho.kafka_consumer.configs.impl.ConsumerConfigsImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConsumerConfigsFactory {

    public static ConsumerConfigs makeConsumerConfigs(){
        return new ConsumerConfigsImpl();
    }

}
