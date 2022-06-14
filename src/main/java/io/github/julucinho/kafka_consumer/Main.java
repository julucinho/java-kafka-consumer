package io.github.julucinho.kafka_consumer;

import io.github.julucinho.kafka_consumer.factory.ConsumerFactory;
import io.github.julucinho.kafka_consumer.reader.TesteTopicReader;
import io.github.julucinho.kafka_consumer.scheduler.Scheduler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        var consumer = ConsumerFactory.makeConsumerOf("teste", "teste-group");
        Scheduler.initScheduledTaskOf(() -> TesteTopicReader.readUsing(consumer));
    }

}
