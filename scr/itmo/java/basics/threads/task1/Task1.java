package itmo.java.basics.threads.task1;

//запуск 10 потоков, каждый из которых выводит числа от 0 до 100

class Task1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
