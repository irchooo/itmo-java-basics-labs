package itmo.java.basics.threads.task3;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        final int THREAD_COUNT = 100;
        final int INCREMENT_PER_THREAD = 1000;
        Counter counter = new Counter();
        CountDownLatch latch = new CountDownLatch(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new Task3(counter, latch, INCREMENT_PER_THREAD));
            thread.start();
        }

        latch.await();
        System.out.println("Значение count: " + counter.getCount());
    }
}
