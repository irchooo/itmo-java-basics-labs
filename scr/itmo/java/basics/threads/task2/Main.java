package itmo.java.basics.threads.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new Task2());

        System.out.println("Перед запуском: " + thread.getState());
        thread.start();
        System.out.println("После запуска: " + thread.getState());
        thread.sleep(50);
        System.out.println("Во время выполнения: " + thread.getState());
        thread.join();
        System.out.println("После завершения: " + thread.getState());
    }
}
