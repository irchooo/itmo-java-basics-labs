package itmo.java.basics.lab4.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        //1
        int[] array1 = new int[] {1, 3, 4, 7, 9};
        checkSortAsc(array1);
        int[] array2 = new int[] {1, 3, 3, 7, 13, 33, 100};
        checkSortAsc(array2);
        int[] array3 = new int[] {1, 3, 4, 7, 9, 0};
        checkSortAsc(array3);
        //2
        createArray();
        //3
        changeFirstLastElements(array1);
        changeFirstLastElements(array2);
        changeFirstLastElements(array3);
        //4
        int[] array4 = new int[] {3, 3, 3};
        findFirstUnique(array4);
        int[] array5 = new int[] {1, 5, 3, 5, 13, 33, 100};
        findFirstUnique(array5);
        int[] array6 = new int[] {1, 1, 13, 1, 1, 1};
        findFirstUnique(array6);
    }

    public static void checkSortAsc(int [] array) {
        System.out.println("--> Задача 1 <--");
        boolean isSortedAsc = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSortedAsc = false;
                break;
            }
        }
        if (isSortedAsc == false) {
            System.out.println("Please, try again");
            System.out.println();
        } else {
            System.out.println("OK");
            System.out.println();
        }
    }

    public static void createArray() {
        System.out.println("--> Задача 2 <--");
        System.out.println("Введите длину массива: ");
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        if (arrayLength > 0) {
            int[] array = new int[arrayLength];
            System.out.println("Введите числа массива: ");
            for (int i = 0; i < arrayLength; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Получившийся массив: " + Arrays.toString(array));
            System.out.println();
        } else {
            System.out.println("Задана некорректная размерность массива");
            System.out.println();
        }
    }

    public static void changeFirstLastElements(int[] array) {
        System.out.println("--> Задача 3 <--");
        if (array.length > 1) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
            System.out.println("Преобразованный массив: " + Arrays.toString(array));
            System.out.println();
        } else {
            System.out.println("Задан некорректный массив");
            System.out.println();
        }
    }

    public static void findFirstUnique(int[] array) {
        System.out.println("--> Задача 4 <--");

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                boolean isUnique = true;
                for (int j = 0; j <array.length; j++) {
                    if (array[i] == array[j] && i != j) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique == true) {
                    System.out.println("Первое уникальное число в массиве: " + array[i]);
                    System.out.println();
                    return;
                }
            }
            System.out.println("Все числа массива повторяются");
            System.out.println();
        } else {
            System.out.println("Задан некорректный массив");
            System.out.println();
        }
    }
}
