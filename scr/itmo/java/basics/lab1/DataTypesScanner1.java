package itmo.java.basics.lab1;

import java.util.Scanner;

public class DataTypesScanner1 {
    public static void main(String[] args) {
        readAndPrintIntegers();
    }

    public static void readAndPrintIntegers() {
        System.out.println("Задача 5: ");
        System.out.println("Пожалуйста, введите целые числа (для выхода введите 'exit'): ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println(number);
            } else if (scanner.hasNext("exit")) {
                System.out.println("Пока!");
                break;
            } else {
                System.out.println("Пожалуйста, введите целые числа или 'exit' для выхода :)");
                scanner.next();
            }
        }
    }
}
