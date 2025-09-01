package itmo.java.basics.threads.task4;

public class Main {
    public static void main(String[] args) {
        SharedLock lock = new SharedLock();
        Thread thread1 = new Thread(new Task4("Thread-1", true, lock));
        Thread thread2 = new Thread(new Task4("Thread-2", false, lock));

        thread1.start();
        thread2.start();
    }
}
