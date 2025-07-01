package itmo.java.basics.lab4.part2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = fillArray();
        int[] sortedArray = mergeSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));
    }

    //метод заполнения массива случайными числами
    public static int[] fillArray() {
        System.out.println("Введите размерность массива: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        if (arrayLength > 0) {
            int[] array = new int[arrayLength];
            Random random = new Random();
            for(int i = 0; i < arrayLength; i++) {
                array[i] = random.nextInt(100);
            }
            System.out.println("Получившийся массив: " + Arrays.toString(array));
            return array;
        } else {
            System.out.println("Некорректная размерность массива");
            return null;
        }
    }

    //метод для сортировки (divide)
    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int mid = array.length / 2;

        int[] left = new int[mid];
        int[] right;
        if (array.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i ++) {
            left[i] = array[i];
        }
        for (int i = 0; i < right.length; i ++) {
            right[i] = array[mid + i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left, right);
    }

    //метод для слияния 2х отсортированных массивов (conquer)
    public static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer ++] = left[leftPointer ++];
                } else {
                    result[resultPointer ++] = right[rightPointer ++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer ++] = left[leftPointer ++];
            } else if (rightPointer < right.length) {
                result[resultPointer ++] = right[rightPointer ++];
            }
        }
        return result;
    }
}
