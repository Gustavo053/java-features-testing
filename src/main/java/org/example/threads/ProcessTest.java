package org.example.threads;

import java.time.Duration;

public class ProcessTest {
    public Runnable executeTask(int jobID) {
        return () -> {
            System.out.println("Starting process execution: " + jobID);
            try {
                Thread.sleep(Duration.ofSeconds(1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Ending process execution: " + jobID);
        };
    }
}
