package io.github.julucinho.kafka_consumer.scheduler;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Scheduler {

    public static void initScheduledTaskOf(Runnable runnable){
        var executor = Executors.newScheduledThreadPool(1);
        executor.scheduleWithFixedDelay(runnable, 0, 2, TimeUnit.SECONDS);
    }

}
