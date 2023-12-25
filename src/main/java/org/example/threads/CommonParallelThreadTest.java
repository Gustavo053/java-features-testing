package org.example.threads;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommonParallelThreadTest {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        try (ExecutorService executorService = Executors.newFixedThreadPool(1000)) {

            var process = new ProcessTest();

            for (int i = 0; i < 5000; i++) {
                executorService.submit(process.executeTask(i));
            }
        }

        System.out.println("Finished in " + Duration.ofMillis(System.currentTimeMillis() - begin).toSeconds() + " seconds");
    }
}
