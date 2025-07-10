package itmo.java.basics.threads.task4;

//создание 2х потоков, каждый из которых выводит по очереди на консоль своё имя

public class Task4 implements Runnable{
    private final String name;
    private final boolean isFirst;
    private final SharedLock lock;

    public Task4(String name, boolean isFirst, SharedLock lock) {
        this.name = name;
        this.isFirst = isFirst;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                while ((isFirst && !lock.isFirstTurn) || (!isFirst && lock.isFirstTurn)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                }

                System.out.println(name);
                lock.isFirstTurn = !lock.isFirstTurn;
                lock.notifyAll();

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
