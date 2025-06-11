package itmo.java.basics.lab1;

import java.util.Scanner;

public class DataTypesScanner2 {
    public static void main(String[] args) {
        checkEvenOdd();
    }

    public static void checkEvenOdd() {
        System.out.println("Задача 6: ");
        System.out.println("Пожалуйста, введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Странное число какое-то...");
        } else {
            if (b % 2 != 0) {
                System.out.println("Нечетное");
            } else {
                if (b > 100) {
                    System.out.println("Выход за пределы диапазона");
                } else {
                    System.out.println("Четное");
                }
            }
        }
    }
}
