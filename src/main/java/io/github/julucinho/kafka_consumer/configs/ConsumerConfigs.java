package io.github.julucinho.kafka_consumer.configs;

import java.util.Properties;

public interface ConsumerConfigs {

    Properties getPropertiesForConsumerOf(String groupId);

}
