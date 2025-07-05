package itmo.java.basics.lab6.task4;

import java.util.Scanner;

public class Drink {
    protected Scanner scanner;
    protected int volumeMl;

    public Drink() {
        scanner = new Scanner(System.in);
        System.out.println("Введите объем напитка в мл: ");
        int inputValumeMl = scanner.nextInt();
        if (inputValumeMl > 0) {
            this.volumeMl = inputValumeMl;
        } else {
            this.volumeMl = 0;
        }
    }
}
