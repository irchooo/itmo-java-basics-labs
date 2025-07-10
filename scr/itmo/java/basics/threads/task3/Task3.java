package itmo.java.basics.threads.task3;

import java.util.concurrent.CountDownLatch;

//запуск 100 потоков, каждый из которых вызывает метод increment() 1000 раз

public class Task3 implements Runnable {
    private final Counter counter;
    private final CountDownLatch latch;
    private final int increments;

    public Task3(Counter counter, CountDownLatch latch, int increments) {
        this.counter = counter;
        this.latch = latch;
        this.increments = increments;
    }

    @Override
    public void run() {
        for (int i = 0; i < increments; i++) {
            counter.increment();
        }
        latch.countDown();
    }
}
