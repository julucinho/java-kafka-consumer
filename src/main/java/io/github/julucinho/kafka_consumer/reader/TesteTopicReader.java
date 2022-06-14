package io.github.julucinho.kafka_consumer.reader;

import io.github.julucinho.kafka_consumer.configs.Consumer;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class TesteTopicReader {

    public static void readUsing(Consumer<String, String> consumer){
        try {
            var messages = consumer.consumeFor(Duration.ofSeconds(10));
            for (var message : messages){
                log.info(message.value());
            }
        }
        catch (Exception exception){
            log.error(exception.getMessage());
        }
    }

}
