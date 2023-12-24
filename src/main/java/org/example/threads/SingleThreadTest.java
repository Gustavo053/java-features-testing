package org.example.threads;

import java.time.Duration;

public class SingleThreadTest {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        var process = new ProcessTest();

        for (int i = 0; i < 5000; i++) {
            process.executeTask(i).run();
        }

        System.out.println("Finished in " + Duration.ofMillis(System.currentTimeMillis() - begin).toSeconds() + " seconds");
    }
}
