package itmo.java.basics.lab1;

import java.util.Scanner;

public class DataTypesScanner1 {
    public static void main(String[] args) {
        System.out.println(readAndPrintIntegers());
    }

    public static String readAndPrintIntegers() {
        System.out.println("Задача 5: ");
        System.out.println("Пожалуйста, введите через пробел три целые числа: ");
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        return (number1 + "\n" +number2 + "\n" +number3);
    }
}

