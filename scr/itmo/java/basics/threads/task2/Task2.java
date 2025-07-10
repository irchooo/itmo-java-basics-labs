package itmo.java.basics.threads.task2;

/*
    вывод состояний потока:
        1. перед его запуском,
        2. после запуска
        3. во время выполнения
*/

public class Task2 extends Thread{
    @Override
    public void run() {
        System.out.println("Во время выполнения (внутри созданного потока): " + Thread.currentThread().getState());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
