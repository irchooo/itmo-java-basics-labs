package itmo.java.basics.lab9.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите, сколько элементов нужно добавить в списки: ");
        Scanner scanner = new Scanner(System.in);
        int listSize = scanner.nextInt();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Comparison.addElements(arrayList, listSize);
        Comparison.addElements(linkedList, listSize);

        System.out.println("Введите, для скольких элементов нужно посчитать время доступа: ");
        int elementsNumber = scanner.nextInt();

        long arrayListTime = Comparison.measureTime(new RandomAccessTask(arrayList, elementsNumber));
        long linkedListTime = Comparison.measureTime(new RandomAccessTask(linkedList, elementsNumber));

        System.out.println();
        System.out.println("--> ArrayList");
        System.out.println("Время доступа (" + elementsNumber + " чтений): " + arrayListTime + " мс");
        System.out.println();
        System.out.println("--> LinkedList");
        System.out.println("Время доступа (" + elementsNumber + " чтений): " + linkedListTime + " мс");

        scanner.close();
    }
}
