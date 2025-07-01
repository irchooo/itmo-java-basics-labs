package itmo.java.basics.lab4.part1;

import java.util.Arrays;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        //1
        printOddNumbers();
        //2
        printDivisibleNumbers();
        //3
        System.out.println("Результат: " + checkSum());
        System.out.println();
        //4
        System.out.println("Результат: " + compareNumbers());
        System.out.println();
        //5
        int[] array = new int[]{1, 2, 4, 6, 13, 3};
        System.out.println("Результат: " + checkFirstLastElement(array));
        System.out.println();
        //6
        System.out.println("Результат: " + checkArray(array));
        System.out.println();
    }

    public static void printOddNumbers() {
        System.out.println("--> Задача 1 <--");
        for(int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void printDivisibleNumbers() {
        System.out.println("--> Задача 2 <--");

        System.out.print("Делятся на 3: ");
        for (int i = 3; i < 100; i+=3) {
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Делятся на 5: ");
        for (int j = 5; j<=100; j+=5) {
                System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("Делятся на 15: ");
        for (int k = 15; k <= 100; k+=15) {
                System.out.print(k + " ");
        }
        System.out.println("\n");
    }

    public static boolean checkSum() {
        System.out.println("--> Задача 3 <--");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите третье целое число: ");
        int thirdNumber = scanner.nextInt();
        return (firstNumber + secondNumber == thirdNumber);
    }

    public static boolean compareNumbers() {
        System.out.println("--> Задача 4 <--");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите третье целое число: ");
        int thirdNumber = scanner.nextInt();
        return (firstNumber < secondNumber && secondNumber < thirdNumber);
    }

    public static boolean checkFirstLastElement(int [] array) {
        System.out.println("--> Задача 5 <--");

        System.out.println("array = " + Arrays.toString(array));
        if (array.length >= 2) {
            return (array[0] == 3 || array[array.length-1] == 3);
        } else {
            return false;
        }
    }

    public static boolean checkArray(int [] array) {
        System.out.println("--> Задача 6 <--");

        System.out.println("array = " + Arrays.toString(array));
        for (int number : array) {
            if (number == 1 || number ==3) {
                return true;
            }
        }
        return false;
    }
}
